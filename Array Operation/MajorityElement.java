// Converted from C++ to Java
import java.util.*;

public class MajorityElement {


    //Moore’s Voting Algorithm
    public static int findMajority(int[] arr, int n)
    {
    	int res = 0, count = 1;

        	for(int i = 1; i < n; i++)
        	{
        		if(arr[res] == arr[i])
        			count++;
        		else 
        			count --;

        		if(count == 0)
        		{
        			res = i; count = 1;
        		}
        	}

        	count = 0;

        	for(int i = 0; i < n; i++)
        		if(arr[res] == arr[i])
        			count++;

        	if(count <= n /2)
        		res = -1;

        	return res; 
    }



    public static void main(String[] args) {

         int[] arr = {8, 8, 6, 6, 6, 4, 6}, n = 7;

         System.out.print(findMajority(arr, n));

    }

    //hashing solution
    // // class Solution {
    // public:
    //     int majorityElement(List<Integer>  nums) {
    //         HashMap<Integer,Integer> map;
    //             for(int i=0;i<nums.size();i++)
    //         {
    //             map[nums[i]]++;
    //         }
    //         for(Integer it:map)
    //         {
    //             if(it.second>nums.size()/2)
    //             {
    //                 return it.first;
    //             }
    //         }
    // return -1;
    //     }
    // };
}

