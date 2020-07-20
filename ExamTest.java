
import java.util.Scanner;

public class ExamTest {

	public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	
	System.out.println("두개의 숫자를 각각 입력하세요.");	
	
	int userInputNum1 = scan.nextInt();
	int userInputNum2 = scan.nextInt();
	
	int resultNum = 0;
	
	for (int i = 1; i <= userInputNum1; i++) {
	resultNum += i;
	}
	System.out.println("첫번째로 사용자로부터 받은 수의 결과 : " + resultNum);
	
	for (int i = 1; i <= userInputNum2 ; i++) {
	resultNum += i;
	}
	System.out.println("두번째로 사용자로부터 받은 수의 결과 : " + resultNum);

	}
	
}