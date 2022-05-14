package Assignment_01;

/*WAP which would contain 6 objects, of a class
Student. Student [Name, Age, section, percentage]. They all belong to
Section-A. Your program would be able to find the average percentage of
students in this section. Use constructors to create these 6 objects and
input from Scanner class
 
 */

public class Q1 {
	public static void main(String[] args) {
		
		
        

       }
}
class Student{
	String Name;
	int age;
	char section;
	float percentage;
	static float avgpercent;
	static int totalstudent;
	Student(String a,int b,char c,float d )
	{
		Name =a;
		age = b;
		section =c;
		percentage = d;
		totalstudent++;
		calculateavg();
	}
	void calculateavg()
	{
		avgpercent = (avgpercent*(totalstudent-1)+percentage)/totalstudent;
	}
}