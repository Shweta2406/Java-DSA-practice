// Converted from C++ to Java
import java.util.*;

public class MovieTicketBooking {


    const char HOST = "localhost";
    const char USER = "root";
    const char PW = "your Password";
    const char DB = "mydb";

    class Seats{
    private:
    	int Seat[5][10];
    public:
    Seats(){
    	for(int i=0; i<5; i++){
    		for(int j=0; j<10; j++){
    			Seat[i][j]=1;
    		}
    	}
    }

    public static int getSeatStatus(int row, int seatNumber){
    	if(row <1 || row >5 || seatNumber <1 || seatNumber >10){
    		return -1;
    	}
    	return Seat [row-1][seatNumber-1];
    }

    public static void reserveSeat(int row, int seatNumber){
    	if(row <1 || row >5 || seatNumber <1 || seatNumber >10){
    		return;	
    }
    Seat [row-1][seatNumber-1] = 0;
    }

    display(){
    	System.out.print(" ");
    for(int i=0; i<10; i++){
    	System.out.print(" " + String.valueOf(i+1));
    }
    System.out.println();

    for(int row=0; row<5; row++){
    	System.out.print(String.valueOf(row+1) + " ");
    	for(int col=0; col<10; col++){
    		if(Seat[row][col]==1){
    			System.out.print("- ");
    		}
    		else{
    			System.out.print("X ");
    		}
    	}
    	System.out.println("|");
    }
    System.out.println("-----------------------");
    }

    getDB(MYSQL conn){
    String query = "SELECT RowNumber, SeatNumber, Seat FROM Ticket";
     if (mysql_query(conn, query.c_str())) {
      System.out.println("Error: " + String.valueOf(mysql_error(conn)));
     }	

     MYSQL_RES result;
     result = mysql_store_result(conn);
     if(!result){
     	System.out.println("Error: " + String.valueOf(mysql_error(conn)));
     }
     MYSQL_ROW row;
     while((row=mysql_fetch_row(result))){
     	int rowNumber = atoi(row[0]);
     	int seatNumber =  atoi(row[1]);
     	int seatStatus = atoi(row[2]);
     	Seat[rowNumber-1][seatNumber-1] = seatStatus;
     }
     mysql_free_result(result);
    }
    };

    public static void main(String[] args){
    	Seats s;
    MYSQL conn;
     conn = mysql_init(null);
     if(!mysql_real_connect(conn, HOST,USER, PW, DB, 3306, null,0)){
     	System.out.println("Error: " + String.valueOf(mysql_error(conn)));
     }
     else{
     	System.out.println("Logged In Database!");
     }
     Sleep(3000);

     if (mysql_query(conn, "CREATE TABLE IF NOT EXISTS Ticket (RowNumber INT, SeatNumber INT, Seat INT)")) {
     System.out.println("Error: " + String.valueOf(mysql_error(conn)));
        }

    for(int row=1; row<=5; row++){
    	for(int seatNumber=1; seatNumber<=10; seatNumber++){
    stringstream ss;
    ss<<"INSERT INTO Ticket (RowNumber,SeatNumber,Seat)"
    <<"SELECT '"<<row<<"', '"<<seatNumber<<"','1' "
    <<"WHERE NOT EXISTS (SELECT FROM Ticket WHERE RowNumber = '"<<row<<"' AND SeatNumber = '"<<seatNumber<<"')";
    String insertQuery=ss.str();
    if(mysql_query(conn,insertQuery.c_str())){
    	System.out.print("Error: " + String.valueOf(mysql_error(conn)));
    }
    	}
    }
    Sleep(3000);

    boolean exit = false;
    while(!exit){
    	system("cls");
    System.out.println();
    System.out.println("Welcome To Movie Ticket Booking System");
    System.out.println("******************************************");
    System.out.println("1. Reserve A Ticket");
    System.out.println("2. Exit");
    System.out.print("Enter Your Choice: ");
     int val;
     val = scanner.nextInt();

     if(val==1){
     s.getDB(conn);
     s.display();

      int row, col;
    System.out.print("Enter Row (1-5): ");
     row = scanner.nextInt();
    System.out.print("Enter Seat Number (1-10): ");
     col = scanner.nextInt();

     if (row < 1 || row > 5 || col < 1 || col > 10) {
     System.out.println("Invalid Row or Seat Number!");
     Sleep(3000);
       continue;
     }
     int seatStatus = s.getSeatStatus(row,col);
     if(seatStatus==-1){
     	System.out.println("Invalid Row or Seat Number!");
     	Sleep(3000);
     	continue;
     }

     if(seatStatus==0){
     	System.out.println("Sorry: Seat is already reserved!");
     	Sleep(3000);
     	continue;
     }

     s.reserveSeat(row,col);
     stringstream ss;
    ss << "UPDATE Ticket SET Seat = 0 WHERE RowNumber = " << row << " AND SeatNumber =" << col;
    String update = ss.str();
    if (mysql_query(conn, update.c_str())) {
     System.out.println("Error: " + String.valueOf(mysql_error(conn)));
    }
    else {
      System.out.println("Seat Is Reserved Successfully in Row " + String.valueOf(row) + " and Seat Number " + String.valueOf(col));
    }
    Sleep(3000);
     }//if1

     else if(val==2){
     	exit = true;
     System.out.println("Good Luck!");
     Sleep(3000);
     }
     else{
     	System.out.println("Invalid Input");
     	Sleep(3000);
     }
    }
    mysql_close(conn); 
        // (return 0 removed - Java main is void)
    }
}

