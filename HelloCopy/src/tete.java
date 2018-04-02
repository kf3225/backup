import java.util.Scanner;

public class tete {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if((N%4==0||N%400==0)&&N%100!=0) {
        	System.out.println(N + " is a leap year.");
        }else{
        	System.out.println(N + " is not a leap year.");
        }
	}

}
