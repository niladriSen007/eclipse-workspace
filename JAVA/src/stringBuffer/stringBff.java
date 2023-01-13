package stringBuffer;

public class stringBff {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("hello");
		System.out.println("buffer=>" + sb);
		System.out.println("length=>"  + sb.length());
		System.out.println("capacity=>" + sb.capacity());
		
		StringBuffer sb1=new StringBuffer("hello");
        System.out.println("before=>"+sb1);
        System.out.println("charAt(1) before=>"+sb1.charAt(1));
        sb1.setCharAt(1, 'i');
        System.out.println("after setCharAt charAt(1) now=>"+sb1.charAt(1));
        System.out.println("now=>"+sb1);
        sb1.setLength(2);
        System.out.println("now=>"+sb1);
        
         
        
        int a=42;
        String s;
        StringBuffer sb2=new StringBuffer(40);
        s=sb2.append("\na => ").append(a).append("!").toString();
        System.out.println(s);
        
        StringBuffer sb3=new StringBuffer("hey  hello");
        sb3.insert(4, "nil");
        System.out.println(sb3);
//        System.out.println(sb3.reverse());
        System.out.println(sb3.delete(3, 7));
        System.out.println(sb3.deleteCharAt(3));
        System.out.println(sb3.replace(0, 3, "hi "));
	}

}
