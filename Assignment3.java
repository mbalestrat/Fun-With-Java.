/* *** Fill in the following ***
   Input data (your student number)          : 3356617
   Answer 1 (evaluated data)                 : 2 2 5 8 8 1 13
   Answer 2 (sum)                            : 39
   Answer 3 (average)                        : 5
   Answer 4 (largest value)                  : 13
   Answer 5 (largest value found in element) : 6
   Answer 6 (smallest value)                 : 1
   Answer 7 (smallest value found in element): 5
*/


/* *** An Example Only ***
   Input data (your student number)          : 1234566
   Answer 1 (evaluated data)                 : 1 1 2 3 5 8 8
   Answer 2 (sum)                            : 28
   Answer 3 (average)                        : 4
   Answer 4 (largest value)                  : 8
   Answer 5 (largest value found in element) : 5
   Answer 6 (smallest value)                 : 1
   Answer 7 (smallest value found in element): 0
*/


import java.util.*;
public class Assignment3
{
   // You must not create other methods or any class-level variables/properties


   // Do not modify the getEvaluation method in any way
   public static int getEvaluation(int input)
   {
      int a=-1;
      int b=1;
      int c=0;
      int index;
      
      for (index=0;index<(input+1);index=index+1)
      {
         c=a+b;
	 a=b;
	 b=c;
      }

      return b;
   }


   // All code that you write must be within the main method (e.g. only method variables)
   public static void main(String args[])
   {
      // Do not modify the code below
      int size;
      Scanner reader=new Scanner(System.in);
      System.out.print("How many inputs? ");
      size=reader.nextInt();
      int inputData[]=new int[size];
      int evaluatedData[]=new int[size];
      // Do not modify the code above. Write your code below...    
    
      // Add code for taking input in to inputData here. You may use either Scanner or ConsoleReader. Scanner is easier as shown above.
       int index;
      
      for(index = 0; index < size; index = index + 1)
      {
    	  System.out.print("Enter value " + index + ":");
    	  inputData[index] = reader.nextInt();
      }
      System.out.println(" ");
    
      
      // Add code for printing inputData here
      System.out.println("You've just entered: ");
      for(index = 0; index < size; index = index + 1)
      { 
      System.out.print(inputData[index] + " ");
      }
      System.out.println("");
      
      // Answer 1
      // Add code here for filling evaluatedData with getEvaluation function values when corresponding inputData values are given
      // Add code for printing evaluation function values
      
      System.out.println("Answer 1 - Evaluation function values as stored in evaluateData:");
     
      index = 0;
      for(index = 0; index < size; index = index + 1)
      { 
    	  evaluatedData[index] = getEvaluation(inputData[index]);
    	  System.out.print(evaluatedData[index] + " ");
      }
      System.out.println("");
      
     
      // Answer 2      
      // Add here the sum (total) calculation/printing code for evaluatedData

      int total;
      total = 0;
      for(index = 0; index < size; index = index + 1)
      {
    	  total = total + evaluatedData[index];	  
      }
      System.out.println("Answer 2 - Sum of evaluated data: " + total);

      // Answer 3
      // Add here the average calculation code
   
      int average;
      average = 0;
      average = total / size;
         System.out.println("Answer 3 - Average of evaluated data: " + average);

      // Answers 4 to 7
      // Add here the code for finding/printing the largest and smallest values in evaluatedData and their locations.
      // Must show answers in the correct order given in the spec.
      // Note: As given in the spec, the smallest and largest values should be the first smallest and the first largest values if duplicates are present.
     
      // Answers 4 & 5
      //(Largest value in evaluatedData and corresponding element number; done in one calculation.)       
    int largest = 0;
    int largestElement = 0;
    for(int x = 0; x < size; x = x + 1)
    {
    	if(evaluatedData[x] > largest)
    	{
    		largest = evaluatedData[x];
    		largestElement = x;
    	}
    }
         System.out.println("Answer 4 - Largest value in evaluated data: " + largest);
    
         System.out.println("Answer 5 - Largest value in evaluated data found in element: " +largestElement );
      
      // Answers 6 & 7
      //(Smallest value in evaluatedData and it's corresponding element number in array.)
         int smallest = size;
         int smallestElement = size;
         for(int i = 0; i < size; i = i + 1)
         {
        	 if(evaluatedData[i] < smallest)
        	 {
        		 smallest = evaluatedData[i];
        		 smallestElement = i;
        	 }
         }
         System.out.println("Answer 6 - Smallest value in evaluated data: " + smallest);
      
      
         System.out.println("Answer 7 - Smallest value in evaluated data found in element: " +smallestElement);
      
   }
}
