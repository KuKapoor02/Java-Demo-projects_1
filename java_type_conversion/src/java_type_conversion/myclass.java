package java_type_conversion;
// Downloaded from https://github.com/KuKapoor02
// Visit https://www.ourcoaching.com/
public class myclass {

	public static void main(String[] args) {
		
		int input = 48, int_val;
		char output,char_int='A';

		// int to char
		output=(char)input;
		// cahr to int
		int_val=(int)char_int;
		
		System.out.println("int " +input+"; to char = "+output);
		System.out.println("char "+char_int+"; to int = "+int_val);
		
		
	}

}