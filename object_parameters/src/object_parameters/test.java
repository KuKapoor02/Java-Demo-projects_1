package object_parameters;

public class test {

	public int i;
	
	public test(int k) {
		this.i=k;
	}
	
	
	public boolean checkVariable(test t) {
		boolean check=false;
		
		if((t.i)==this.i) {
			check=true;
		}else check=false;
		
		return check;
	}
}
