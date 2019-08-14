/*
 * To.개발자님께
초단위로 알려주는 시험이 있는데
이 값을 몇시간 몇분 몇초인지 계속 계산해야 해서요.
혹시 초값을 입력받으면 자동으로 계산되는 프로그램을 만들어 줄 수 있을까요?
그러니까 500초 이면 뭐 몇시간 몇분 몇초라고 보여주면 좋겠죠.  for /
i / 60 

 */
package homeworks02;
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;


public class TimeCalc {
	
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	Date date = new Date();
	SimpleDateFormat sdf = new SimpleDateFormat("hh 시간 mm분 ss초");
	System.out.println("초를 입력하여 주십시오");
	int sec = scanner.nextInt();
	String now = sdf.format(sec);
	String sequence = "";
	int series = 0;
	int hour = 0;
	/*for (int i=1;i<=500; i++) {
		if(i==60) {
			sequence = i +"분";
		} else if(i!=60) {
			sequence = i + "초";
		} else {} */
	System.out.println(now);
	}
	}
