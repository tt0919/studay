import com.sun.java_cup.internal.internal_error;

/**
 * name:liutingting
 * function:binarySearch
 * level:wait
 */
public class binarySearch {

	public static int binarysearch(int leftindex,int rightindex,int array[],int e) {
		int mid=(leftindex+rightindex)/2;
		int midvalue=array[mid];
		int flag=-2;
		System.out.println("midvalue:"+midvalue+"left:"+leftindex+"right:"+rightindex);
		if(leftindex<=rightindex)
		{
			if(midvalue>e)//left
				binarysearch(leftindex, mid-1, array, e);
			else if(midvalue<e)
				binarysearch(mid+1, rightindex, array, e);
			else if (midvalue==e) {
				flag=mid;
				
			}
			else {
				flag=-1;//with out
			}
		}
		return flag;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []array={1,2,3,4,5,6,7,8,9};
		System.out.println(binarysearch(0,8,array,7));
	}

}
