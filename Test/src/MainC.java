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
public class MainC {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO 自動生成されたメソッド・スタブ
		CoinCase prcnt = new CoinCase();
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		
		System.out.print("現在500円の枚数：");
		int _500yen = Integer.parseInt(br.readLine());
		prcnt.setCoin500(_500yen);
		
		System.out.print("現在100円の枚数：");
		int _100yen = Integer.parseInt(br.readLine());
		prcnt.setCoin100(_100yen);
		
		System.out.print("現在50円の枚数：");
		int _50yen = Integer.parseInt(br.readLine());
		prcnt.setCoin50(_50yen);
		
		System.out.print("現在10円の枚数：");
		int _10yen = Integer.parseInt(br.readLine());
		prcnt.setCoin10(_10yen);
		
		System.out.print("現在5円の枚数：");
		int _5yen = Integer.parseInt(br.readLine());
		prcnt.setCoin5(_5yen);
		
		System.out.print("現在1円の枚数：");
		int _1yen = Integer.parseInt(br.readLine());
		prcnt.setCoin1(_1yen);
		System.out.println();
		
		System.out.print("500円追加枚数：");
		int add500yen =Integer.parseInt(br.readLine());
		prcnt.setAdd500(add500yen);
		System.out.print("100円追加枚数：");
		int add100yen =Integer.parseInt(br.readLine());
		prcnt.setAdd100(add100yen);
		System.out.print("50円追加枚数：");
		int add50yen =Integer.parseInt(br.readLine());
		prcnt.setAdd50(add50yen);
		System.out.print("10円追加枚数：");
		int add10yen =Integer.parseInt(br.readLine());
		prcnt.setAdd10(add10yen);
		System.out.print("5円追加枚数：");
		int add5yen =Integer.parseInt(br.readLine());
		prcnt.setAdd5(add5yen);
		System.out.print("1円追加枚数：");
		int add1yen =Integer.parseInt(br.readLine());
		prcnt.setAdd1(add1yen);
		System.out.println();
		
		prcnt.sum500();
		prcnt.sum100();
		prcnt.sum50();
		prcnt.sum10();
		prcnt.sum5();
		prcnt.sum1();
	}

}
