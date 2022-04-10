package unit_01;

/* Problem Statement:

P8_String: 

(Create separate logic in separate function)

F1 - Check the entered string is palindrome or not? 
  		String s = "75457"
  		Output: Yes it is a palindrome or No it is not a palindrome.

F2 - Make a reverse of a string using?
F3 - String Compare: Check if the strings are equal or not?

 * */

public class P8_String {

	public static void main(String[] args) {

		QuestionsOnString obj = new QuestionsOnString();

		String s1 = new String("75457");
		String s2 = new String("7545a");

		obj.palindromeOrNot(s1);
		obj.reverseOfAString(s1);
		obj.stringEqualOrNot(s1, s2);

	}

}

class QuestionsOnString {

	void palindromeOrNot(String s) {
		int flag = 0;
		for(int i=0,j=s.length()-1;i<j;i++,j--)
		{
			if(s.charAt(i)!=s.charAt(j))
			{
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println("Yes it is a palindrome");
		}
		else {
			System.out.println(" No it is not a palindrome");
		}
			

	}

	void reverseOfAString(String s) {
		char ch[] = s.toCharArray();
		String rev = "";
		for(int i = ch.length-1;i>=0;i--)
		{
			rev+=ch[i];
		}
		System.out.print("the reversed string is  ");
		System.out.println(rev);

}
	
	void stringEqualOrNot(String s1,String s2) {
	  if(s1.length()!=s2.length())
		 {
		System.out.println("no");
	}
	  else {
		  for(int i = 0;i<s1.length();i++)
		  {
			  if(s1.charAt(i)!=s2.charAt(i))
			  {
				  System.out.println("no");
				  return ;
			  }
		  }
		  System.out.println("yes");
	  }
   }
}