package vc;
import java.util.*;
public class VowelConsonent {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean isVowel=false;
		System.out.println("Enter The Character ");
		char ch=sc.next().charAt(0);
		switch(ch){
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U': isVowel=true;
		}
		if(isVowel==true)
			System.out.println(ch+" Is A VOWEL");
		else {
			if(ch>='a' && ch<='z'||ch>='A' && ch<='Z')
				System.out.println(ch+" Is A Consonant");
			else
				System.out.println(ch+" Is Not A Character");
		}
		
	}

}
