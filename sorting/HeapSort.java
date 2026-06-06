// Converted from C++ to Java
import java.util.*;

public class HeapSort {





    public static void heapify(int[] arr, int n, int i) 
    { 
    	int largest = i; 
    	int l = 2*i + 1; 
    	int r = 2*i + 2;
    	if (l < n && arr[l] > arr[largest]) 
    		largest = l; 

    	if (r < n && arr[r] > arr[largest]) 
    		largest = r; 

    	if (largest != i) 
    	{ 
    		{ int _t = arr[i]; arr[i] =  arr[largest];  arr[largest] = _t; }; 
    		heapify(arr, n, largest); 
    	} 
    } 

    public static void buildheap(int[] arr,int n)
    {
        for (int i = n / 2 - 1; i >= 0; i--) 
    		heapify(arr, n, i);
    }
    public static void heapSort(int[] arr, int n) 
    {  
    	buildheap(arr,n); 

    	for (int i=n-1; i>0; i--) 
    	{ 
    		{ int _t = arr[0]; arr[0] =  arr[i];  arr[i] = _t; };
    		heapify(arr, i, 0); 
    	} 
    } 

    public static void printArray(int[] arr, int n) 
    { 
    	for (int i=0; i<n; ++i) 
    		System.out.print(String.valueOf(arr[i]) + " ");
    	System.out.println();
    } 

    public static void main(String[] args) 
    { 
    	int[] arr = {12, 11, 13, 5, 6, 7}; 
    	int n = sizeof(arr)/sizeof(arr[0]); 

    	heapSort(arr, n); 

    	System.out.print("Sorted array is \n");
    	printArray(arr, n); 
    } 

}
