class SoftwareEnginner{

String name;
int experience;
String designation;
double sal;

SoftwareEnginner()
{
	System.out.println("run constructor");
	
}
SoftwareEnginner(String name,int experience,String designation,double sal)
{
	this.name=name;
	this.experience=experience;
	this.designation=designation;
	this.sal=sal;
	
}
public void show()
{
	System.out.println("name:"+this.name);
	System.out.println("experience:"+this.experience);
	System.out.println("designation:"+this.designation);
	System.out.println("sal:"+sal);

}
}