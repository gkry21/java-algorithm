/*
 * To. 개발자님
프로그램을 하나 개발해야 합니다.
교수가 요청하기를 브라우저에서 사용할 계산기를 만들어 달랍니다.
복잡할 필요는 없고, 사칙연산 가능하고 나눗셈은
몫과 나머지값으로 출력하면 된답니다.
출력결과물은 예를 들어
5 + 5 = 10
2 - 7 = -5
이렇게 되고,
10 / 3 = 3 [1] 나눗셈은 이렇게 나오면 된답니다.
그러면 []값이 나머지인지는 교수가 이미 알고 있겠답니다.
 */

package homeworks02;
import java.util.Scanner;

public class ArithmeticCalculator {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("연산자를 선택하세요.1. + |n 2. - |n  3. / |n 4. *");
		int op = scan.nextInt();
		System.out.println("값을 입력해주세요");
		System.out.println("첫번째 값");
		int first  = scan.nextInt();
		System.out.println("두번째 값");
		int sec = scan.nextInt();
		
	//	switch() {}
		
}
}