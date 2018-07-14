
class vol extends packing{

	//no inputs configuration
	vol(){
		super();
		vol= super.len * super.het * super.wid * super.mass;
	}
	
	// if all inputs given
	vol(int len,int wid, int het, int mas)
	{
		super(len,wid,het,mas);
		vol= super.len * super.het * super.wid * super.mass;
	}
	
	// constructor if cube
	vol(int len,int mas){
		super(len,mas);
		vol = super.len * super.len * super.len * super.mass;
	}
	
	void display_vol(){
		
		System.out.println("THE VOLUME o box is : "+ vol);
	}
}
