package privateINHERITENCE;

public class BOX_MAIN1 {

	public static void main(String[] args) {
		BOX_DEMO1 myBox1=new BOX_DEMO1();
		BOX_DEMO1 myBox2=new BOX_DEMO1(10,11,12,13);
		BOX_DEMO1 myBox3=new BOX_DEMO1(myBox2);
		
		
		   System.out.println("THE VOLUME IS =>"+myBox1.volume());
		   System.out.println("THE WEIGHT IS =>"+myBox1.weight);
		   
		   System.out.println("THE VOLUME IS =>"+myBox2.volume());
		   System.out.println("THE WEIGHT IS =>"+myBox2.weight);
  
		   System.out.println("THE VOLUME IS =>"+myBox3.volume());
		   System.out.println("THE WEIGHT IS =>"+myBox3.weight);
		   
		   
		   BOX_DEMO1 myBox4=new BOX_DEMO1(20,21,22,23);
		   BOX1 plainBox=new BOX1();
		   
		   System.out.println("THE VOLUME OF PLAINBOX BEFORE ASIGNING IS =>"+plainBox.volume());
		   
		   
		   plainBox=myBox4;
		  
		   
		   System.out.println("THE VOLUME IS =>"+myBox4.volume());
		   System.out.println("THE WEIGHT IS =>"+myBox4.weight);
		   
		   System.out.println("THE VOLUME OF PLAINBOX AFTER ASSIGNING  IS =>"+plainBox.volume());
		   
	}

}
