abstract class Programming{
	public abstract void Developer();
	public abstract void Rank();
	
}

class HTML extends Programming{
	
	@Override
	public void Developer(){
	
	System.out.println("HTML is Developed b:  Tim Berners Lee..!");
	}
	
	public void Rank(){
		System.out.println("HTML is in 3rd rank");
	}
}

class Java extends Programming{

	@Override
	public void Developer(){
	System.out.println("Java is Developed by:  James Gosling....!");
	}
	
	public void Rank(){
		System.out.println("Java in in 2nd rank");
	}
	
}

class Main{
	
	public static void main(String args[]){
	System.out.println("Main Started");
	System.out.println("HTML Object Creation is Started");
	HTML h = new HTML();
	h.Developer();
	h.Rank();
	
	
	System.out.println("Java Object Creation ");
	Java j = new Java();
	j.Developer();
	j.Rank();

	
	System.out.println("Main Ended");
	}

}