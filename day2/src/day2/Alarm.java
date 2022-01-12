package day2;
import java.util.Scanner;
public class Alarm {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.print("시간을 입력하시오: ");
	int hour = sc.nextInt();
	System.out.print("분을 입력하시오: ");
	int min = sc.nextInt();
	int al=min-45;
	
	if (al<0) {
		hour-=1;
		if (hour<0)
			hour=23;
		min=60+al;
		System.out.println(hour+"시 "+min+"분");}
	else {
		System.out.println(hour+"시 "+al+"분");}
}
}
