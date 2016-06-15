/**
 *name:liutingting
 *function:bubblesort
 *level:pass
 */
public class bubbleSort {

	public static void bubblesort(int[] array) {
		int temp;
		for (int i = 0; i < array.length-1; i++) {
			for (int j = i+1; j < array.length; j++) {
				if(array[i]>array[j]){
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []array={9,8,7,6,5,4,3,2,1};
		for (int i : array) {
			System.out.print(i+"  ");
		}
		bubblesort(array);
		System.out.println();
		for (int i : array) {
			System.out.print(i+"  ");
		}
	}

}
