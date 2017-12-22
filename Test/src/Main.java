import java.io.IOException;

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
	 */
	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		for(int a = 1; a <= 8; a++){
			System.out.print(Math.pow(2, a) + "/");
		}
		
		for(int b = 7; b >= 0; b--){
			System.out.print((b * (b - 1)) + "/");
		}
	}

}
