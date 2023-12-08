package seqsearch;

public class SeqSearch02 {

	
	public int SeqSearch02(int[] arr, int num, int key) {
		arr[num] = key;
		// for 문으로 하기
//		for(int i=0; i<num+1; i++) {
//			if(arr[i] == key) {
//				if(i != num) {
//					return i;
//				}else {
//					return -1;
//				}
//			} else
//				continue;
//		}	
//		return -1;
		
		// while 문으로 하기.
		int i = 0;
		while( i<num+1) {
			if(arr[i] != key) {
				i++;
			} else {
				if(i != num) {
					return i;
				} else {
					return -1;
				}
			}
		}
		return -1;
	}
}
