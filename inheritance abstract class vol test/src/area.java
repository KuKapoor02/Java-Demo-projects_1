
 class area extends box{

	 int area;
	 
	 //constructor if no values case
	 area(){
		 super();
		 area=this.len*this.wid;
	 }
	 
	 //constructor if values given
	 area(int i,int j){
		 super(i,j);
		 area=this.len*this.wid;
	 }
	 
	 //constructor if square detected
	 area(int i){
		 super(i);
		 area=this.len*this.wid;
	 }
void area_dis(){
	System.out.println("Area : "+ this.area);
}
 
 }
