// Converted from C++ to Java
import java.util.*;

public class ElectionWinner {

    // Elections are conducted in a town that has a population N. All the people of the town,
    //  cast votes on the various candidates in town. The people of the town later realized that
    //   the votes if only the candidates 18 and above years of age should be considered. 
    //   Find out the candidate who is the winner if only the votes of age group 18 and above are considered.
    //    If the winner convict be decided or there is a tie, print -1. You are given an array vote which 
    //    represents the candidate to whom the vote is given by the ith and another array of age which 
    //    represents the age of that particular voter

    // Input Format:

    // The input consists of three lines:

    // The first line will contain one value N, the size of the arrays. 
    // The second line will 
    // contain N space-separated positive integers denoting the array of the vote.
    // The third line will contain N space-separated positive Integers denoting the array of age. 
    // The input will be read from the STDIN by the candidate

    // Output Format:

    // Print the number which represents the winner. If the winner cannot be decided or there is a tie,
    //  print -1. The output will be matched to the candidate's output printed on the STDOUT

    // Constraints:

    // .15N5200

    // Example:

    // Input:

    // 10

    // 1 1 2 3 4 1 2 2 3 1

    // 24 13 35 15 50 16 20 18 25 64

    // Output:

    // 2

    // Explanation:

    // So, candidate 1 gets 4 votes, candidate 2 gets 3 votes,
    //  candidate 3 gets 2 votes, and candidate 4 gets 1 vote. 
    //  But the 2nd and the 5th vote given to candidate 1 are from age groups below 
    //  In so they are not considered. So, the new vote count is candidate 1 gets 2 votes,
    //   candidate 2 gets 3 votes, candidate 3 gets 2 votes and candidate 4 gets 1 vote.








    public static void main(String[] args)
    {
        int n;
        n = scanner.nextInt();
        int votes[n];
        for(int i=0;i<n;i++)
        {
            votes = scanner.nextInt()[i];
        }
        int ages[n];
        for(int i=0;i<n;i++)
        {
            ages = scanner.nextInt()[i];
        }

        List<Integer> votecount(4,0);
        for(int i=0;i<n;i++)
        {
            if(ages[i]>=18)
            {
                votecount[votes[i]-1]++;
            }
        }
        int winner=-1;
        int maxvotes=0;
        boolean istie=false;

        for(int i=0;i<votecount.size();i++)
        {
            if(votecount[i]>maxvotes)
            {
                maxvotes=votecount[i];
                winner=i+1;
                istie=false;

            }
            else if(maxvotes==votecount[i])
            {
                istie=true;
            }
        }
        if(istie)
        {
            System.out.print(-1);
        }
        else
        System.out.print(winner);

    // (return 0 removed - Java main is void)
    }
}
