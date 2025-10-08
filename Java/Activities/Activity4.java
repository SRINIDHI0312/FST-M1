

public class Activity4 {

	public static void main(String[] args) {

		int array[]= {4,3,2,10,12,1,5,6};
		
			for (int i=1;i<array.length;i++) {
			int key = array[i];
			int j = i-1;
			
		while(j>=0 && key < array[j]) {
			
			array[j+1]=array[j];
			j=j-1;
		}
			array[j+1]=key;
			}
			
		for (int i=0; i<array.length;i++) {
		System.out.println(array[i]);
		}
	}
}
