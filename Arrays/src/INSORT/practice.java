package INSORT;

import java.util.Arrays;

public class practice {
		//Purpose: To add an element into an index in a array
		public static String AddElementToArray() {
		   int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		   int[] new_array = new int[my_array.length+1];
		   
		   for(int i=0; i<my_array.length;i++) {
			   new_array[i]=my_array[i];
		   }// System.out.println(Arrays.toString(new_array));
		    // Insert an element in 3rd position of the array (index->2, value->5)
		   int Index_position = 2;
		   int newValue    = 5;
		   System.out.println("Original Array : "+Arrays.toString(my_array));     
		  for(int i=my_array.length; i > Index_position; i--){
		    new_array[i] = new_array[i-1];
		   }
		   new_array[Index_position] = newValue;
		   System.out.print("New Array: ");
		   return Arrays.toString(new_array);
		}
		//Purpose: To find all duplicate array elements
		  public static int[] FindDuplicateElements(int [] A){
			    int counter = 0;
			     int [] B = new int[A.length/2];
			  for(int i=0;i<=A.length-1;i++){
			     for(int j=i+1;j<=A.length-1;j++){
			       if(A[i]==A[j]){
			         B[counter]=A[i];counter++;}}
			     }System.out.print("Duplicate Values: ");return B;
			  }
		//Purpose: To find all common elements b/w two arrays
		  public static String FindCommonElements(int[]A,int[]B) {
			    for(int i=0;i<=A.length-1;i++){
				     for(int j=0;j<=B.length-1;j++){
				       if(A[i]==B[j]){
				         System.out.println(A[i]);
				       } }}return "Above are the common elements";}
		
			  
		 public static void main(String[] args) {
			 int[] A = {3,4,2,5,76,3,2,5,7,6,2,64,34};  
			 int[] B = {3,6,2,5,46,3,22,35,770,86,12,643,324};  
			 System.out.println(AddElementToArray());
			   System.out.println(Arrays.toString((FindDuplicateElements(A))));
			 System.out.println(FindCommonElements(A,B));
}	
		   }
