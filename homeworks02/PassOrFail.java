package HomeWorks02;

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