
class packing extends box {
	
	// construcor if no parameter mention(default values)
	packing(){
		
		super();
		mass=50;
	}

	//constructor if all values given
	packing(int len,int wid, int het,int mas){
		super(len,wid,het);
		mass =mas;
	}
	
	//constructor if cube 
	packing(int len,int mas){
		super(len);
		mass=mas;
	}
}
