package stringNEW;

public class STRING {

	public static void main(String[] args) {
		
		char c[]= {'j','a','v','a'};
		
		String s1=new String(c); //CHARACTER TYPE ER ARRAY KE STRING E CONVERT KORLAM
		String s2=new String(s1);//S1 STRING ER VALUE NIYE S2 OBJECT BANALAM JETA STRING TYPE ER
		String s3=new String("core java");//DIRECT INPUT DIYE STRING TYPE ER OBJECT BANALAM
		//String s3="core java";
		
        System.out.println(s1); //java
        System.out.println(s2); //java
        System.out.println(s3);
        
        
        
        System.out.println("\n");
        
        
        
        byte ascii[]= {65,66,67,68,69};//BYTE TYPE ER ARRAY
        String s4=new String(ascii);//ARRAY KE STRING E CONVERT KORLAM
        System.out.println(s4);//ABCDE
        
        
        System.out.println("\n");
        
        
        String s5=new String(ascii,2,ascii.length-2);
        System.out.println(s5);//CDE
        
        System.out.println("\n");
        
        
        //------------------------------------//    //------------------------------------//    //------------------------------------//
        
        
       //WAY-1
//        String s6="hello world";
//        char a[];
//        a=s6.toCharArray();//JEHUTU S6[0],S6[1] EGULO STRING E HOBENA TAI STRING KE ARRAY TE CONVERT KORCHI...
//        for(int i=0;i<a.length;i++)
//        {
////       	System.out.print(a[i]);
//        	System.out.print(s6.charAt(i));
//        }
        
        
        //------------------------------------//     //------------------------------------//    //------------------------------------//
        
        
        
        //WAY-2
//        String s6="hello world";
//        for(int i=0;i<s6.toCharArray().length;i++)//STRING S6 KE CHARACTER TYPE ER ARRAY TE CONVERT KORLAM
//        {
//      	    System.out.print(s6.charAt(i));
//        }
        
        //------------------------------------//     //------------------------------------//     //------------------------------------//
        
     //   WAY-3  //FOR EACH
        String s6="hello world";
        char a[]=s6.toCharArray();
        for(int i:a)//STRING S6 KE CHARACTER TYPE ER ARRAY TE CONVERT KORLAM
        {
      	    System.out.print((char)i);
      	    
        }
        char c1=(char)(a[1]-32);
        System.out.println(c1); 
        
        
        System.out.println("\n");
        
        
        //------------------------------------//    //------------------------------------//     //------------------------------------//
        
        //WAY-4
//        String s6="hello world";
//        for(int i:s6.toCharArray())//STRING S6 KE CHARACTER TYPE ER ARRAY TE CONVERT KORLAM
//        {
//      	    System.out.print((char)i);
//      	   
//        }
        
      //------------------------------------//    //------------------------------------//     //------------------------------------//
        
          
        String s="hello world22";
        for(int i=0;i<s.length();i++)
        {
        	System.out.print(s.charAt(i));
        }
        System.out.println("\n");
        
        
        //STRING THEKE CHARACTER TYPE ER ARRAY TE CONVERT KORE KICHU CHARACTER TULLAM
        String s7="I AM THE BEST IN THIS WORLD";
        int start=5,end=8;
        char cArray[]=new char[end-start];
        s7.getChars(start, end, cArray, 0);
        System.out.println(cArray);
        
        
        System.out.println("\n");
        
        String s8="hello";
        String s9="hello";
        String s10="HELLO";
        String s11="Hello World";
        String s12="hELLO wORLD";
        System.out.println(s8.equals(s9));
        System.out.println(s9.endsWith(s10));
        System.out.println(s10.equals(s11));
        System.out.println(s11.equals(s12));//JEHUTU DUTOR CASE SENSITIVE
        System.out.println(s11.equalsIgnoreCase(s12)); //CASE IGNORE KORCHE
        
        System.out.println("\n");
        
        
        String s13="hello world";
        System.out.println(s13.startsWith("hel"));
        System.out.println(s13.endsWith("war"));
        
        
        System.out.println("\n");
        
        
        
        String old="hello world";
        String New=new String(old);//OLD STRING ER SAME VALUE NIYE NEW STRING TOIRI HOLO
        
        
        System.out.println("\n");
        
        
        String s14="hello";
        String s15="Hello";
        System.out.println(s14.compareTo(s15));
        System.out.println(s14.compareToIgnoreCase(s15));
        
        System.out.println("\n");
        
        
        String arr[]= {
        		"tip","uip","aiv","lip","Nip"
        };
        for(int i=0;i<arr.length;i++)
        {
        	
        	for(int j=0;j<arr.length-i-1;j++)
        	{
        		if((arr[j].compareTo(arr[j+1]))>0)
        		{
        			String t=arr[j];
        			 arr[j]=arr[j+1];
        			 arr[j+1]= t;
        			
        			
        		}
        		
        	}
        }
        for(int i=0;i<arr.length;i++)
        {
        	System.out.println(arr[i]);
        }
        
        
	}

}
