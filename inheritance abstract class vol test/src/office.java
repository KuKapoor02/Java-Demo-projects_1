  // Downloaded from https://github.com/KuKapoor02
    // Visit https://www.ourcoaching.com/
public class office {
public static void main(String[] args){
	
//	int i,j,k;
	
	area kk1=new area();
	area kk2=new area(50,60);
	area kk3=new area(90);
	
	area t;
	
	System.out.println("CASE 1 of default values");
	t=kk1;
	t.show_val();
	t.area_dis();
	
	System.out.println("Values manually loaded");
	t=kk2;
	t.show_val();
	t.area_dis();
	
	System.out.println("SQUARE");
	t=kk3;
	t.show_val();
	t.area_dis();
	
}
}
