public class box {

	//declaring instance variable of box l,b,h,w,v
	int len,wid,het;
	int mass,vol;
	
	// declaring constructor with no inputs(default configuration
	box(){
		this.len=10;
		this.wid=20;
		this.het=30;
	}
	
	//declaring constructor with all inputs mentioned
	box(int len,int wid,int het){
		this.len=len;
		this.wid=wid;
		this.het=het;
	}
	
	//declaring a constructor with cubical configuration
	box(int len){
		this.len=len;
		this.wid=len;
		this.het=len;
	}
}
