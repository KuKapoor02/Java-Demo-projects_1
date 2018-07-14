package inheritance_test;

public class kunal {	
	
	public int i;
	public int j;
	public int k;
	
	public kunal() {
		this.i=10;
		this.j=20;
		this.k=30;
	}
}

 class kapoor extends kunal{
	
	 public void display_all() {
		 System.out.println("value of i from super class = " + i);
		 System.out.println("value of j from super class = " + j);
		 System.out.println("value of k from super class = " + k);
	 }
	 
}
