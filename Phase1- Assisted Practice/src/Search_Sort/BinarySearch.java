package Search_Sort;

import java.util.Arrays;

public class BinarySearch {
	public static void main(String args[]){  
	    int numArray[] = {5,10,15,20,25,30,35}; 
	    System.out.println("The input array: " + Arrays.toString(numArray));
	    
	    int key = 20;
	    
	    int first = 0;
	    
	    int last=numArray.length-1; 
	    //calculate mid of the array
	    int mid = (first + last)/2;  
	    
	    while( first <= last ){  
	        //if the mid < key, then key to be searched is in the first half of array
	        if ( numArray[mid] < key ){  
	            first = mid + 1;     
	        }else if ( numArray[mid] == key ){ 
	            
	            System.out.println("Element is found at index: " + mid);  
	            break;  
	        }else{  
	            //the key is to be searched in the second half of the array
	            last = mid - 1;  
	        }  
	        mid = (first + last)/2;  
	   }  
	   //if first and last overlap, then key is not present in the array
	   if ( first > last ){  
	      System.out.println("Element is not found!");  
	   }       
	 }  

}
