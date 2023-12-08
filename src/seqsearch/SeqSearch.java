package seqsearch;

public class SeqSearch {

	public static int seqSearch(int[] arr, int key, int num) {
		for(int i=0; i<num; i++){
			if (arr[i] == key) {
				return i;
			} 
		}
		return -1;
		
//		int i=0;
//		while(true) {
//			if (i == num)
//				return -1;
//			if (arr[i] == key)
//				return i;
//			i++;
//		}
	}
}
