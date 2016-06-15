import com.sun.java_cup.internal.internal_error;

/**
 *name:liutingting
 *function:quickSort
 *level:no
 */
public class quickSort {
	public static void quicksort(int[] array,int left,int right){
		if(left<right)
		{
			int base=array[left];
			int i=left;
			int j=right;
			int temp;
			do{
				while(i<right&&array[i]<base)
					i++;
				while(j>left&&array[j]>base)
					j--;
				if(i<=j){
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
					i++;
					j--;
				}
			}while(i<=j);
			if(i<right)
				quicksort(array,i,right);
			if(j>left)
				quicksort(array,left,j);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []array={9,8,7,6,5,4,3,2,1};
		for (int i : array) {
			System.out.print(i+"  ");
		}
		quicksort(array,0,8);
		System.out.println();
		for (int i : array) {
			System.out.print(i+"  ");
		}
	}

}
