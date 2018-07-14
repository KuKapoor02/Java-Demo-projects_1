
abstract class box {

	int len,wid;
	//constructor if no values given. LOAD default values 
	box(){
		
		this.len=10;
		this.wid=20;
	}
	
	//constructor if value given
	box(int len,int wid){
		
		this.len=len;
		this.wid=wid;
	}
	
	//constructor if square
	box(int len){
		this.len=len;
		this.wid=len;
	}
	
	void show_val(){
		System.out.println("Value of constructor len and wid are : "+ this.len + " "+ this.wid);
	}
}
