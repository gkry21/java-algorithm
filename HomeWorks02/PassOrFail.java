    
/*
 * To. 개발자님
  성적표 프로그램 을 하나 개발해야 합니다.
 교수는 학생과 국어, 영어, 수학점수만 입력하면
 총점, 평균, 합격여부가 출력되는 프로그램 입니다.
 오더는 다음과 같이 화면에 출력하라고 합니다.
 
학생           국어        영어        수학        총점        평균        합격여부
 =======================================================
 홍길동     90       90      90     270      90       (장학생)
 
 합격여부는 다음과 같다고 합니다.
 평균이 90점 이상이면 장학생
 0점 이상 90점미만 이면 합격
 70미만이면 불합격이라고 하네요.
 단) 평균에서 소수점이하는 절삭입니다.
 
 */

package homeworks02;

import java.util.Scanner;

public class PassOrFail {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("학생이름과 국어, 영어, 수학 점수를 차례대로 입력해주세요");
		String name = scan.next();
		int kor = scan.nextInt(), math =scan.nextInt() , eng = scan.nextInt();
		int sum = kor + math + eng;
		int avg =  sum / 3;

			if(avg>=70){
				System.out.println("학생           국어        영어        수학        총점        평균        합격여부");
				System.out.println(" =======================================================");
				System.out.println(name    +    kor     +  math    + eng       + sum     + avg        + "(합격)");
			}
			else if(avg<=69) {
				System.out.println("학생           국어        영어        수학        총점        평균        합격여부");
				System.out.println(" =======================================================");
				System.out.println(name    +     kor     +  math    + eng       + sum     + avg        + "(불합격)");
			} 
		}	
}