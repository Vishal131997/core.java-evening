java.util.Scanner;

interface Client{

	void input();
	void output();
	
}

class Vishal implements Client{
	
	String name; double salary;
	
	public void input(){
	Scanner r = new Scanner(System.in);
	System.out.println("Enter User Name");
	name=r.nextLine();
	
	System.out.println("Enter Salary");
	salary=r.nextdouble();

	}
	
public static void main(String args[]){
	Vishal ref = new Vishal();
	ref.input();
	ref.output();

}
}