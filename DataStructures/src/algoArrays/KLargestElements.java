package algoArrays;

import java.util.Iterator;
import java.util.PriorityQueue;

public class KLargestElements {
	

	
	public static void main (String[] args)
	{
	    int arr[] = { 11, 3, 2, 1, 15, 5, 4,
	                  45, 88, 96, 50, 45 };
	     
	    int size = arr.length;
	     
	    // Size of Min Heap
	    int k = 3;
	     
	    FirstKelements(arr, size, k);
	}

	private static void FirstKelements(int[] arr, int size, int k) {
		// TODO Auto-generated method stub
		
		PriorityQueue<Integer> queue= new PriorityQueue<Integer>();
		
		for(int i=0;i<k; i++) {
			queue.add(arr[i]);
		}
		
		for(int i=k;i<arr.length;i++) {
			if(arr[i]<queue.peek()) {
				continue;
			}else {
				queue.poll();
				queue.add(arr[i]);
			}
		}
		
		 Iterator iterator = queue.iterator();
	     
		    while (iterator.hasNext())
		    {
		        System.out.print(iterator.next() + " ");
		    }
		
	}
}
