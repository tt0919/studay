/**
 *name:liutingting
 *function:selectionsort
 *level:pass
 */
public class selectionSort {

	public static void selectionsort(int[] array) {
		int temp;
		int j;
		for (int i = 0; i < array.length-1; i++) {
			int k=i;
			for (j = i+1; j < array.length; j++) {
				if(array[k]>array[j]){
					k=j;
				}
			}
			temp=array[k];
			array[k]=array[i];
			array[i]=temp;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []array={9,8,7,6,5,4,3,2,1};
		for (int i : array) {
			System.out.print(i+"  ");
		}
		selectionsort(array);
		System.out.println();
		for (int i : array) {
			System.out.print(i+"  ");
		}
	}


}
