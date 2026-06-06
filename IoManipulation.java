// Converted from C++ to Java
import java.util.*;

public class IoManipulation {


    public static void main(String[] args)
    {
    boolean a=true;
    System.out.print(std::noboolalpha);
    System.out.println(a);

    System.out.print(std::boolalpha);
    System.out.print(a);

    //decimal,octal,hexadecimal conversions

    int p=26;
    System.out.print(String.valueOf(endl) + String.valueOf(std::oct));
    System.out.println(p);
    System.out.print(std::showbase);

    System.out.print(std::oct);
    System.out.println(p);

    System.out.print(std::hex);
    System.out.println(p);

    System.out.print(std::dec);
    System.out.println(p);

    System.out.print(std::uppercase);
    System.out.println(p);

    System.out.print(std::showpos);
    System.out.println(p);

    int c=1234.567;
    System.out.print(std::setprecision(4));
    System.out.print(c);

    int cc=1.2;
    System.out.print(std::showpoint);
    System.out.print(cc);

    //formatting manipulation
    String x="hii";
    System.out.print(std::setw(5));
    System.out.print(std::setfill('#'));
    System.out.println(x);

    System.out.print(std::left);
    System.out.print(std::setw(5));
    System.out.print(std::setfill('#'));
    System.out.println(x);
    // (return 0 removed - Java main is void)
    }
}
