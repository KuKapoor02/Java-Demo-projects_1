package control_statements_1;
// Downloaded from https://github.com/KuKapoor02
// Visit https://www.ourcoaching.com/
public class myClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// condition control variable
		boolean check=true;
		
		if(check) {
			System.out.println("Condition is true");
		}else {
			System.out.println("Condition is false");
		}
		
		
		// Nested if condition
		
		System.out.println("nested if condition");
		boolean check2=true,check_nested=false;
		if(check2) {
			System.out.println("Condition_2 is true");
			if(check_nested) {
				System.out.println("Nested Condition is true");
			}else {
				System.out.println("Nested Condition is true");
			}
		}else {
			System.out.println("Condition_2 is false");
		}

	}

}
