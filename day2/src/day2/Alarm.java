package day2;
import java.util.Scanner;
public class Alarm {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.print("�ð��� �Է��Ͻÿ�: ");
	int hour = sc.nextInt();
	System.out.print("���� �Է��Ͻÿ�: ");
	int min = sc.nextInt();
	int al=min-45;
	
	if (al<0) {
		hour-=1;
		if (hour<0)
			hour=23;
		min=60+al;
		System.out.println(hour+"�� "+min+"��");}
	else {
		System.out.println(hour+"�� "+al+"��");}
}
}
