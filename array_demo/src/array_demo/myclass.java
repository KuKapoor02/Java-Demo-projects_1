package array_demo;
// Downloaded from https://github.com/KuKapoor02
// Visit https://www.ourcoaching.com/
public class myclass {

	public static void main(String[] args) {
		int array[][]= new int[5][5];
		int i, j, k = 10;
		
		for(i=0; i<5; i++) {
			for(j=0; j<5; j++) {
				array[i][j] = k++;
		}
		
		}
		for(i=0; i<5; i++) {
		for(j=0; j<5; j++)
		System.out.print(array[i][j] + " ");
		System.out.println();

	}

}
}
