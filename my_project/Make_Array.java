package my_project;

// Input 값 Array에 추가하는 클래스
public class Make_Array {

	
	public int[] Arr_Int(int[] arr, int a){
		int[] tmp = new int[arr.length+1];
		for(int i=0; i < arr.length; i++) {
			tmp[i] = arr[i];
		}
		tmp[arr.length]= a;
		arr = tmp;
		return arr;
	}
	
	public String[] Arr_Str(String[] arr, String a) {
		String[] tmp = new String[arr.length+1];
		for(int i=0; i<arr.length; i++) {
			tmp[i] = arr[i];
		}
		tmp[arr.length] = a;
		arr = tmp;	
		return arr;
	}
	
	
}
