package stringNEW;
import java.util.*;
public class SubString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String org="This is a Test,This is,Too";
		String search=" is";
		String sub=" was";
		String result="";
		int i;
		
		do {
			System.out.println(org);
			i=org.indexOf(search);
			if(i!=-1) {
				result=org.substring(0,i);
				result=result.concat(sub);
				result=result+org.substring(i+search.length());
				org=result;
			}
		}while(i!=-1);

	}

}
