package first_project;
import java.util.*;
public class Array {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		int[] iArr1 = new int[10];
		int[] iArr2 = new int[10];
//		int[] iArr3 = new int[] {100,95,80,70,60};
		int[] iArr3 = {100, 95, 80, 70, 60};
		char[] chArr = {'a','b','c','d'};
		String[] name = new String[3];
		name[0] = "kim";
		name[1] = "moon";
		name[2] = "keum";
		
		
		for (int i = 0; i < iArr1.length; i++) {
			iArr1[i] = i + 1;
		}
		
		for (int i=0; i < iArr2.length; i++) {
			iArr2[i] = (int)(Math.random()*10) + 1;
		}
		
		for(int i=0; i<iArr1.length; i++) {
			System.out.print(iArr1[i]+",");
		}
		
		System.out.println();
		System.out.println(iArr2);e
		System.out.println(iArr3);
		System.out.println(chArr);
		System.out.println(iArr3);
		System.out.println(chArr);
		System.out.println(name);
		
		String input = scanner.nextLine();
		
		
		// 배열복사
		
		int[] arr = new int[5];
		
		for(int i=0; i < arr.length; i++)
			arr[i] = i +1;
		
		System.out.println("[변경전]");
		System.out.println("arr.length:"+arr.length);
		for(int i=0; i < arr.length; i++)
			System.out.println("arr["+i+"]:"+arr[i]);
		
		int[] tmp = new int[arr.length*2];
		
		for(int i=0; i < arr.length; i++)
			tmp[i] = arr[i];
		
		arr = tmp;
		
		System.out.println("[변경후]");
		System.out.println("arr.length:"+arr.length);
		for(int i=0; i < arr.length; i++)
			System.out.println("arr["+i+"]:"+arr[i]);
		
		
		// p196 5-5
		
		int sum = 0;
		float average = 0f;
		
		int [] score = {100, 88, 100, 100, 90};
		
		for(int i=0; i < score.length; i++) {
			sum += score[i];
		}
		average = sum / (float)score.length;
		
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + average);
		
		
		
		// p197 5-6
		
		int[] score = {79, 88, 91, 33, 100, 55, 95};
		int max = score[0];
		int min = score[0];
		
		for(int i=1; i < score.length; i++) {
			if(score[i] > max) {
				max = score[i];
			} else if(score[i] < min) {
				min = score[i];
			}
		}
		
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		
		
		// p197 5-7
		
		int[] numArr = new int[10];
		
		for(int i=0; i < numArr.length; i++) {
			numArr[i] = i;
			System.out.print(numArr[i]);
		}
		System.out.println();
		
		for(int i=0; i < 100; i++) {
			int n = (int)(Math.random()*10);
			int tmp = numArr[0];
			numArr[0] = numArr[n];
			numArr[n] = tmp;
		}
		
		for(int i=0; i < numArr.length; i++) {
			System.out.print(numArr[i]);
		}
		
		
		// 199p 5-8
		
		int[] ball = new int[45];
		
		for(int i=0; i < ball.length; i++) {
			ball[i] = i+1;
		}
		
		int temp = 0;
		int j = 0;
		
		for(int i=0; i < 6; i++) {
			j = (int)(Math.random()*45);
			temp = ball[i];
			ball[i] = ball[j];
			ball[j] = temp;
		}
		
		for(int i=0; i < 6; i++) {
			System.out.printf("ball [%d] = %d%n", i, ball[i]);
		}
		
		
		// 200p 5-9
		
		int[] code = {-4, -1, -3, 6, 11};
		int[] arr = new int[10];
		
		for( int i=0; i < arr.length; i++) {
			int tmp = (int)(Math.random() * code.length);
			arr[i] = code[tmp];
		}
		
		System.out.println(Arrays.toString(arr));
		*/
		
		// 201p 5-10
		
		int[] numArr = new int[10];
		
		for(int i=0; i < numArr.length; i++) {
			System.out.print(numArr[i] = (int)(Math.random() * 10));
		}
		System.out.println();
		
		for(int i=0; i < numArr.length-1; i++) {
			boolean changed = false;
			
			for(int j=0; j < numArr.length-1-i; j++) {
				if(numArr[j] > numArr[j+1]) {
					int temp = numArr[j];
					numArr[j] = numArr[j+1];
					numArr[j+1] = temp;
					changed = true;
				}
			}
			if(!changed) break;
			
			for(int k=0; k < numArr.length; k++) {
				System.out.print(numArr[k]);
			}
			System.out.println();
		}
		
		
		
		
	}

		
}


		