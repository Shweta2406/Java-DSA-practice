// Converted from C++ to Java
import java.util.*;

public class StonePaperScissor {


    public static void main(String[] args)
    {
        System.out.print("Let's play \"stone paper scissor\" game!!");
        System.out.print("\nAre you ready? ");
        String ans;
        ans = scanner.nextInt();

        if (ans == "yes")
        {
            System.out.print("Let's begin!\n");

            // Seed random number generator
            //srand(time(0));
            int comp_inp = rand() % 3;
            String comp;

            // Map computer input to choice
            switch (comp_inp)
            {
            case 0:
                comp = "stone";
                break;
            case 1:
                comp = "paper";
                break;
            case 2:
                comp = "scissor";
                break;
            }

            // Player input
            System.out.print("\nEnter your choice (stone/paper/scissor): ");
            String your_inp;
            your_inp = scanner.nextInt();

            System.out.print("\nYour input is: " + String.valueOf(your_inp));
            System.out.print("\nComputer input is: " + String.valueOf(comp));

            // Determine winner
            if (your_inp == comp)
            {
                System.out.print("\nIt's a tie!");
            }
            else if ((your_inp == "stone" && comp == "scissor") ||
                     (your_inp == "paper" && comp == "stone") ||
                     (your_inp == "scissor" && comp == "paper"))
            {
                System.out.print("\nYou win!");
            }
            else
            {
                System.out.print("\nComputer wins!");
            }
        }
        else
        {
            System.out.print("Next time!");
        }

        // (return 0 removed - Java main is void)
    }

}
