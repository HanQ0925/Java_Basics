package conditional_repetitive_statement;

public class FlowEx13 {

	public static void main(String[] args) {
		int sum=0;
		
		for(int i=1; i<=10; i++) {
			sum += i;
			System.out.printf("1���� %2d ������ ��: 2%d%n", i, sum);
		}
	}

}
