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
public class Main2 {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO 自動生成されたメソッド・スタブ
		Sub2 multi = new Sub2();
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		int num = Integer.parseInt(br.readLine());
		multi.setNum(num);
		
		if(multi.getNum() >= 10 || multi.getNum() <= 0){
			System.out.println("ERROR");
		}else{
			System.out.print(multi.getNum() + "の段：");
			for(int i = 1; i <= 9; i++){
				System.out.print(multi.getNum() * i + " ");
			}
		}

	}

}
