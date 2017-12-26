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
public class Main3 {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO 自動生成されたメソッド・スタブ
		Sub3 profile = new Sub3();
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		System.out.print("Dog's Name : ");
		String name = br.readLine();
		System.out.print("Its Age : ");
		int age = Integer.parseInt(br.readLine());
		System.out.print("Its Kind : ");
		String kind = br.readLine();
		
		profile.setName(name);
		profile.setAge(age);
		profile.setKind(kind);
		
		profile.showProfile();
	}

}
