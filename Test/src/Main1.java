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
public class Main1 {

	/**
	 * @param args
	 * @throws IOException
	 * @throws NumberFormatException
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		Sub1 star = new Sub1();
		int num = Integer.parseInt(br.readLine());
		star.setNum(num);

		for(int i = 0; i < star.getNum(); i++){
			for(int j = 0; j <= i; j++){
				if((i + j) % 2 == 0){
					System.out.print("あ");
				}else{
					System.out.print("か");
				}
			}
			System.out.println();
		}


	}

}