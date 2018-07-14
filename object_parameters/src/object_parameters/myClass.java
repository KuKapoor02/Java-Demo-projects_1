package object_parameters;

public class myClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		test t1=new test(20);
		test t2=new test(30);
		test t3=new test(20);
		
		System.out.println("Checking 1 and 2 = "+t1.checkVariable(t2));
		System.out.println("Checking 1 and 3 = "+t3.checkVariable(t3));
		System.out.println("Checking 2 and 3 = "+t2.checkVariable(t3));
	}

}
