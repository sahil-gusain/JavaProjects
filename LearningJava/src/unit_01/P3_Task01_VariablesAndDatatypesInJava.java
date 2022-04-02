package unit_01;

/*
  variables in java is a data container that save the data values during java program execution
  
  types of variable:
  -In java there are three types of variables:
     
     . local variable :- declared inside the body of  a method
     
     . Instance variables :-declared outside the body of any method
       -they are defined without using the STATIC keyword
       -they are object specific and are known as as instance variables.
     
     .Static variables -they are defined with static keyword
      -Static variables are initialized only once ,at the start of program execution
      -these static variables should be initialized first ,before the initialization of any instance variable
      -also known as class variable, as it shared among all the variable
      -can be accessed through a class variable
      
      
   Data types in java
     data types in java are defined as specifiers that allocates different sizes and type of values that can that can be stored 
     in the variable or identifier
     
     types of data types
      -primitive data type:- these are the most basic data types in java.It includes boolean,char,byte,short,int,float,double 
      
      -non-primitive data types:-The non-primitive data types include Classes, Interfaces, and Arrays.
      
        Data Type 		Default size
         boolean 	 	1 bit
          char 		    2 byte
          byte 	 	    1 byte
         short 		    2 byte
          int 	     	4 byte
         long 	    	8 byte
         float 	     	4 byte
         double 		8 byte
 */

public class P3_Task01_VariablesAndDatatypesInJava {

	static int  a = 11;
	int p = 10;
	public static void main(String[] args) {
		//valid declarations
		int a, b=20, c=15;//integer(whole no)
		float pi;//floating point no
		double d;
		char e;//character
		String mytext ="hello!";//String
		boolean mybool = true;//bpplean
		
		//valid initializations
		pi = 3.14f;
		d =20.22d;
		e = 'a';
		a = 10;
		
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(pi);
		System.out.println(e);
		System.out.println(mytext);
		System.out.println(mybool);
		
		System.out.println(ABC.j); // Data + functions/methods
        // ABC.display();
        
        ABC obj1 = new ABC();
        System.out.println(obj1.i++);
        System.out.println(obj1.i);
        
        ABC obj2 = new ABC();
        System.out.println(obj2.i);
        
        
        System.out.println(ABC.j++);
        System.out.println(ABC.j);
        
        ABC.typeconversionAndTypecasting();
		
		
	}

}

class ABC {
  static int j = 10;// class variable/static variable
  int i = 10;// Instance variable

static void typeconversionAndTypecasting()
{
  
  /*
   * Double f; //8 bytes = 64 bits/slots int i=10;//4 bytes=32 bits/slots 
   * f=i; // Type conversion system.outprintln(f);
   *
   *double g = 10 ; // 64 int j; //32 j = (int)g;
   */
  
  double f; //64 slots
  int i = 10; //32 slots
  f = i; //Type Conversion
  System.out.println(f);
  
  double g = 10; //64
  int j; //32
  j = (int)g;//Type Casting
  
  //32 bits = 64 bits
  
  System.out.println(i);
  System.out.println(j);
}
}
