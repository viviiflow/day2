package day2;
import java.util.Scanner;
public class score {
public static void main(String[] args) {
	char grade='a';
	Scanner sc=new Scanner(System.in);
	
	System.out.println("������ �Է��ϼ���(0~100):");
	int score=sc.nextInt();
	if ((score>=0) && (score<=100))
		if(score>=90)
			grade='A';
		else if(score>=80)
			grade='B';
		else if(score>=70)
			grade='C';
		else if(score>=60)
			grade='D';
		else
			grade='F';
	
	System.out.println("������ "+grade+"�Դϴ�.");
}
}
