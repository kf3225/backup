import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 */

/**
 * @author internousdev
 *
 */
public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Sub taro = new Sub();
		double number1 = Integer.parseInt(br.readLine());
		taro.setNum1(number1);
		double number2 = Integer.parseInt(br.readLine());
		taro.setNum2(number2);
		System.out.println(taro.getAvg());
	}

}