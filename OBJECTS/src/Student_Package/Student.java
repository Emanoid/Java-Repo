package Student_Package;

public class Student {
	//constructors
	String name, lastname;
	double gpa;
	int age;
	//selectors
	String getName() {return(name);}
	String getLastname() {return(lastname);}
	double getGpa() {return(gpa);}
	int getAge() {return(age);}
	//Other Observers
	String convert2String() {
		return(name+""+lastname+" has a "+gpa+" gpa and is "+age+" years old. ");
	}
	//Mutators
	void setName(String newname) {name=newname;}
	void setLastname(String newln) {lastname=newln;}
	void setGpa(double newgpa) {if (newgpa>0) {gpa=newgpa;}}
	void setAge(int newage) {if (newage>=0) {age=newage;}}
	
	public Student(String nm, String ln, double g, int a) {
		name =nm;
		lastname=ln;
		gpa = g;
		age =a;
	}
	public Student(String nm, String ln, int a) {
		name =nm;
		lastname=ln;
		gpa = 0;
		age =a;
	}
}
