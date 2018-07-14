
public class next {

	int l,b,h;
	
	public next() {
		this.l=10;
		this.b=20;
		this.h=30;
	}
	

	public next(int len) {
		this.l=len;
		this.b=20;
		this.h=30;
	}
	

	public next(int len,int br) {
		this.l=len;
		this.b=br;
		this.h=30;
	}
	
	public next(int len,int br,int he) {
		this.l=len;
		this.b=br;
		this.h=he;
	}
	
	public int Volume() {
		return (this.l * this.b + this.h);
	}
	
}
