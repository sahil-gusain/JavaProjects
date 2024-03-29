package unit_01;
/*
 * Control And Conditional Statements:
 - Java provides three types of control flow statements.
 - Decision Making Statements
   - if statements
   - switch statements
   
 - Loop Statements
   - do while loop
   - while loop
   - for loop
   - for-each loop
   
 - Jump Statements
   -break statement
   -continue statement
 */
public class P4_Task04_ControlAndConditionalStatementsInJava {

	public static void main(String[] args) {
		Statements obj = new Statements();
		obj.DecisionMakingStatments();
		obj.LoopStatements();
		obj.JumpStatements();

	}

}

class Statements{
	
	void DecisionMakingStatments( ) {
		
		int x = 10;
		int y = 12;
		if(x + y < 10 )
		{
			System.out.println(" x + y is less than 10");
		}else {
			System.out.println("x + y is greater than 20");
			
		}
		int num = 2;
		
		  switch (num)
		  {
		  case 0:
		  System.out.println("number is 0");
		  break;
		  case 1:
		  System.out.println("number is 0");
		  break;
		  default:
		  System.out.println("number is 0");
		  }

		  }
		 
		  void LoopStatements()
		  {
		  //for loop
		  int sum = 0;
		  for(int j = 1; j <= 10 ; j++)
		  {
		  sum = sum + j;
		  }
		 
		  System.out.println("The sum of first 10 natural is : " + sum);
		 
		  //for Each
		  String[] names = {"Java" , "Ritik" , "c" , "C++" , "Python" };
		  System.out.println("Printing the content of the array names : \n");
		   for(String name : names)
		   {
		   System.out.println(name);
		   }
		  
		   //while(condition){looping statements}
		   int i = 1 , j = 1;
		   System.out.println("Printing the list of first 10 odd numbers \n");
		   while(i <= 10)
		   {
		   System.out.println(j);
		   j = j + 2;
		   i++;
		   }
		  }
		   
		    
		   void JumpStatements()
		   {
		   //Break
		   System.out.println(" This is for representing the jump statements \n");
		   System.out.println("Break Statement : ");
		   for(int i = 0 ; i <= 10 ; i++)
		   {
		   if(i == 6)
		   break;
		   System.out.println(i);
		   }
		  
		   //continue
		   System.out.println("\ncontinue Statement : ");
		   for(int i = 0 ; i <= 10 ; i++)
		   {
		   if(i == 6)
		   continue;
		   System.out.println(i);
		   }
		  }
}
