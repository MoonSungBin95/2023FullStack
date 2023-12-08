package my_project;

import java.util.Arrays;

public class PhysicalExamination {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PhyscData[] x = {
				new PhyscData("강민하",162,0.3),
				new PhyscData("김찬우",173,0.7),
				new PhyscData("박준서",175,2.0),
				new PhyscData("유서범",171,1.5),
				new PhyscData("이수연",168,0.4),
				new PhyscData("장경오",174,1.2),
				new PhyscData("황지안",169,0.8),
				new PhyscData("문성빈",170,0.3),
				new PhyscData("강민하",162,1.3),
				new PhyscData("김찬우",173,1.7),
				new PhyscData("박준서",175,1.0),
				new PhyscData("유서범",171,1.5),
				new PhyscData("이수연",168,1.4),
				new PhyscData("장경오",174,1.2),
				new PhyscData("황지안",169,1.8),
				new PhyscData("문성빈",170,1.3),
				new PhyscData("강민하",162,0.3),
				new PhyscData("김찬우",173,0.1),
				new PhyscData("박준서",175,2.0),
				new PhyscData("유서범",171,1.8),
				new PhyscData("이수연",168,0.1),
				new PhyscData("장경오",174,1.3),
				new PhyscData("황지안",169,0.9),
				new PhyscData("문성빈",170,0.4),
				
		};
		
		System.out.println(" 이름     키     시력");
		System.out.println("---------------------");
		for(int i=0; i<x.length; i++) {
			System.out.printf("%s    %d    %.1f\n", x[i].name,x[i].height,x[i].vision);	
		}
		
		System.out.println();
		System.out.printf("평균 키 : %.1fcm\n", PhyscData.aveHeight(x));
		PhyscData.visDistribution(x);
		
//		int i = 0;
//		int[] dist = new int[PhyscData.VMAX];
//		
//		dist[i] = 0;
//		for(i=0; i< x.length; i++) {
//			if(x[i].vision >= 0.0 && x[i].vision <= PhyscData.VMAX / 10.0) {
//				dist[(int)(x[i].vision * 10)]++;
//			}
//		}
		
	}

}
