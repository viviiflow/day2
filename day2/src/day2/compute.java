package day2;
import java.util.Scanner; 
public class compute {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("");
	int num1 = sc.nextInt();
	System.out.print("");
	int num2 = sc.nextInt();
	
	if ((num1>=1) && (num2<=10000))
		System.out.println(num1+num2);
		System.out.println(num1-num2);
		System.out.println(num1*num2);
		System.out.println(num1/num2);
		System.out.println(num1%num2);
	

}
}
