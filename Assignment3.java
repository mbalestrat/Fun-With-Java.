


import java.util.*;
public class Assignment3
{

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


   public static void main(String args[])

      int size;
      Scanner reader=new Scanner(System.in);
      System.out.print("How many inputs? ");
      size=reader.nextInt();
      int inputData[]=new int[size];
      int evaluatedData[]=new int[size];
      // Do not modify the code above. Write your code below...    
    
    
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
      

      
      System.out.println("Answer 1 - Evaluation function values as stored in evaluateData:");
     
      index = 0;
      for(index = 0; index < size; index = index + 1)
      { 
    	  evaluatedData[index] = getEvaluation(inputData[index]);
    	  System.out.print(evaluatedData[index] + " ");
      }
      System.out.println("");
      
     

      int total;
      total = 0;
      for(index = 0; index < size; index = index + 1)
      {
    	  total = total + evaluatedData[index];	  
      }
      System.out.println("Answer 2 - Sum of evaluated data: " + total);

   
      int average;
      average = 0;
      average = total / size;
         System.out.println("Answer 3 - Average of evaluated data: " + average);

   
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
