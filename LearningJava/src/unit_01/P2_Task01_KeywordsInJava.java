package unit_01;

public class P2_Task01_KeywordsInJava {

	  /* 
	   * 50 keywords
	   * Reserved keywords [meaning are already defined in the complier]
	   * we are not supposed to use such java keywords as identifiers in our program
	   * ->Method
	   * ->objects
	   * ->variables
	   */
	public static void main(String[] args) {
		
        void  int() {//we can't have function name as a keyword (int)
        	System.out.println("hello wrld!");
  }
        int int =124;// we cannot have a variable name as keyword (int)
        keyword void = new keyword();//we cannot have a object name as keyword (void)
        
        System.out.println(void.a);
  }

}
class void //we cannot have a class name as keyword (void)
{
	int a;
}
class keyword
{
	int a=6;
}