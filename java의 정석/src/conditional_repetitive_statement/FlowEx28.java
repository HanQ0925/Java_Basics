package conditional_repetitive_statement;

import java.util.Scanner;

public class FlowEx28 {

	public static void main(String[] args) {
		int input = 0, answer = 0;
		
		answer = (int) (Math.random()*100)+1;
		Scanner scanner =new Scanner(System.in);
		
		do {
			System.out.print("1�� 100������ ������ �Է��ϼ��� : ");
			input = scanner.nextInt();
			
			if(input > answer) {
				System.out.println("�� ���� ���� �Է����ּ���");
			}else if (input < answer) {
				System.out.println("�� ū ���� �Է����ּ���");
			}
		}while(input !=answer);
		System.out.println("�����Դϴ�.");
		
	}

}
