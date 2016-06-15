/**
 *name:liutingting
 *function:insertsort
 *level:pass
 */
public class insertionSort {

	public static void insertsort(int[] array) {
		int temp;
		int j;
		for (int i = 1; i < array.length; i++) {
			temp=array[i];
			for (j = i-1; j>=0&&temp<array[j]; j--) {
				array[j+1]=array[j];
			}
			array[j+1]=temp;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []array={9,8,7,6,5,4,3,2,1};
		for (int i : array) {
			System.out.print(i+"  ");
		}
		insertsort(array);
		System.out.println();
		for (int i : array) {
			System.out.print(i+"  ");
		}
	}

}
