/**
 *
 */

/**
 * @author internousdev
 *
 */
public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Person taro=new Person(0, null);
		System.out.println(taro.name);
		System.out.println(taro.age);


		Person jiro=new Person(18,"gon");
		System.out.println(jiro.name);
		System.out.println(jiro.age);

		Person hanako=new Person(16);
		System.out.println(hanako.name+"\n"+hanako.age);
		
		Person saburo=new Person("三郎");
		System.out.println(saburo.name);
		System.out.println(saburo.age);
		
		
		
		

	}

}