import java.util.*;
// Downloaded from https://github.com/KuKapoor02
// Visit https://www.ourcoaching.com/
public class office {

	public static void main(String[] args){
		
		int i,j,k,l,caseid;
		
		Scanner oc_var=new Scanner(System.in);
		
		System.out.println("Starting multi level hierachy code"+ "\n");
		
		System.out.println("Enter you choice of box variables");
		System.out.println("1. if no variable"+"\n"+"2. if all variables"+"\n"+"3. if cube");
		caseid=oc_var.nextInt();
		
		switch(caseid){
		
		case 1:
			System.out.println("No variable mode selected. Default values loaded");
			vol kk1=new vol();

			System.out.println("Values are, len: "+ kk1.len+ "\n"+"wid: "+ kk1.wid+"\n"+"hieght: "+ kk1.het+"\n"+ "mass: "+kk1.mass);	
			
			kk1.display_vol();
			
		break;
		
		case 2:
			System.out.println("inputs mode selected");
			System.out.println("Enter lenght of box");
			i=oc_var.nextInt();
			System.out.println("Enter width of box");
			j=oc_var.nextInt();
			System.out.println("Enter hieght of box");
			k=oc_var.nextInt();
			System.out.println("Enter mass of box");
			l=oc_var.nextInt();
			vol kk2=new vol(i,j,k,l);

			System.out.println("Values are, len: "+ kk2.len+ "\n"+"wid: "+ kk2.wid+"\n"+"hieght: "+ kk2.het+"\n"+ "mass: "+kk2.mass);	
			
			kk2.display_vol();
		break;
			
		case 3:
			System.out.println("cube mode selected");
			System.out.println("Enter lenght of box");
			i=oc_var.nextInt();
			System.out.println("Enter mass of box");
			j=oc_var.nextInt();
			vol kk3=new vol(i,j);

			vol mVar;
			mVar=kk3;
			System.out.println("Values are, len: "+ mVar.len+ "\n"+"wid: "+ mVar.wid+"\n"+"hieght: "+ mVar.het+"\n"+ "mass: "+ mVar.mass);				
			
			kk3.display_vol();
			break;
		}
		
		
	}
}
