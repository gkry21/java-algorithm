/*

 * To. �����ڴ�

����� ��Ʈ�ø��� ����ȸ�Դϴ�.

�ѹ��� Ʈ������ ���󼱼��� �� 3�� �Դϴ�.

�� ������ 100m ����� �Է¹޾Ƽ� 

1, 2, 3 ���� ������ �մϴ�.

 

A ���� ��� : 10.5��

B ���� ��� : 10.8��

C ���� ��� : 10.1�� 

��� �Է¹޾Ҵٸ�

 

###### ���� ��ŷ #######

 

1�� : C ���� ��� (10.1��)

2�� : A ���� ��� (10.5��)

3�� : B ���� ��� (10.8��)

 

��� ��½����ּ���.

 

 */

package HomeWorks02;
import java.util.Scanner;

public class Ranking {

   // int �迭 [3] , for �迭�� ���� ����������� 

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

 

		System.out.println("����� �Է����ּ���");

		System.out.println("A����");

		float a = scan.nextInt();

		System.out.println("B����");

		float b = scan.nextInt();

		System.out.println("C����");

		float c = scan.nextInt();

		float[] rank = {a, b, c};

		

		for(int i  = 0; i < rank.length  ; i++ ){

			

			int tmp = i; 

			float value = rank[i]; 

			for(int j = i+1; j < rank.length; j++) {

				if(rank[tmp] > rank[j] ) {

					float value2 = rank[j]; 

					rank[tmp] = value2;

					rank[j] = value;      

				}

			}
		}

		for(int i  =0; i < rank.length  ; i++ ){

			System.out.println(i+1+"��:" + rank[i]);
		}
	}

}