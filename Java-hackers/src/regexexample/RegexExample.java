package regexexample;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String phone;
		System.out.println("Enter your phone:");
		phone = sc.nextLine();
		System.out.println("Length: "+phone.length());
		
//		Pattern p = Pattern.compile("^[+][9][1][-][0-9]{10}$");
		Pattern p = Pattern.compile(".+[a]$");
		Matcher m  = p.matcher(phone);
		
		if(m.find()) {
			System.out.println("phone is valid!");
		} else {
			System.out.println("Invalid phone!!!");
		}
		

	}

}
