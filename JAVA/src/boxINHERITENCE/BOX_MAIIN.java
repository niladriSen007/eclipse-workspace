package boxINHERITENCE;

public class BOX_MAIIN {

	public static void main(String[] args) {
		BOX_DEMO myBox1=new BOX_DEMO(12.3,23,16,17.6);
		BOX_DEMO myBox2=new BOX_DEMO(10,20,30,40);
		
	   double vol;
	   
	  vol=myBox1.volume();
	   System.out.println("THE VOLUME IS =>"+vol);
	   System.out.println("THE WEIGHT IS =>"+myBox1.weight);
	   
	   System.out.println("THE VOLUME IS =>"+myBox2.volume());
	   System.out.println("THE WEIGHT IS =>"+myBox2.weight);
	   
	   
	   BOX_DEMO myBox3=new BOX_DEMO(12,13,14,15);
	   BOX plainBox=new BOX();
	   
	   
	   System.out.println("THE VOLUME OF PLAINBOX BEFORE ASIGNING IS =>"+plainBox.volume());
	   
	   
	   System.out.println("THE VOLUME IS =>"+myBox3.volume());
	   System.out.println("THE WEIGHT IS =>"+myBox3.weight);
	   
	   
	   //Assigning BOX_DEMO Reference To Box Reference
	   plainBox=myBox3;
	   System.out.println("THE VOLUME OF PLAINBOX AFTER ASSIGNING  IS =>"+plainBox.volume());
	   
	   //DOES NOT DEFINE WEIGHT NUMBER MANE BOX CLASS E JEHUTU KONO WEIGHT BOLE VARIABLE NEI TAI plainBox.weight ERROR!!! ASBE
//	   System.out.println("THE WEIGHT IS =>"+plainBox.weight);
	}

}
