package my_project;

public class PhyscData {
	
	static final int VMAX = 21;
	
	String name;
	int height;
	double vision;
	
	public PhyscData(String n, int h, double v) {
		// TODO Auto-generated constructor stub
		this.name = n;
		this.height = h;
		this.vision = v;
	}
	
	public static double aveHeight(PhyscData[] dat) {
		double sum = 0;
		for(int i=0; i<dat.length; i++) {
			sum += dat[i].height;
		}
		return sum/dat.length;
		
	}
	
	public static void visDistribution(PhyscData[] dat) {
		for(int i=0;i<VMAX; i++) {
			int count = 0;
			for(int j=0; j<dat.length; j++) {
				if(i == dat[j].vision*10) {
					count += 1;
				} else
					continue;
			}
			String star = "";
			for(int k=0; k<count; k++) {
				star += "*";
			}
			System.out.printf("%.1f ~: %s\n", i*0.1,star);
//			System.out.println(i*0.1 +"~: "+ count +"명"); // 포매팅 이상함.
		}
	}
}
