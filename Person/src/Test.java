/**
 *
 */

/**
 * @author internousdev
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Person taro = new Person();
		taro.name = "山田太郎";
		taro.age = 20;
		taro.phoneNumber = "080-1111-1111";
		taro.address = "東京";
		System.out.println(taro.name);
		System.out.println(taro.age);
		System.out.println(taro.phoneNumber);
		System.out.println(taro.address);
		taro.talk();
		taro.walk();
		taro.run();
		System.out.println();


		Person jiro = new Person();
		jiro.name = "木村次郎";
		jiro.age = 18;
		jiro.phoneNumber = "080-2222-2222";
		jiro.address = "神奈川";
		System.out.println(jiro.name);
		System.out.println(jiro.age);
		System.out.println(jiro.phoneNumber);
		System.out.println(jiro.address);
		jiro.talk();
		jiro.walk();
		jiro.run();
		System.out.println();


		Person hanako = new Person();
		hanako.name = "鈴木花子";
		hanako.age = 16;
		hanako.phoneNumber = "080-3333-3333";
		hanako.address = "埼玉";
		System.out.println(hanako.name);
		System.out.println(hanako.age);
		System.out.println(hanako.phoneNumber);
		System.out.println(hanako.address);
		hanako.talk();
		hanako.walk();
		hanako.run();
		System.out.println();


		Robot aibo = new Robot();
		aibo.robotName = "AIBO";
		aibo.talk();
		aibo.walk();
		aibo.run();
		System.out.println();


		Robot asimo = new Robot();
		asimo.robotName = "ASIMO";
		asimo.talk();
		asimo.walk();
		asimo.run();
		System.out.println();


		Robot pepper = new Robot();
		pepper.robotName = "PEPPER";
		pepper.talk();
		pepper.walk();
		pepper.run();
		System.out.println();


		Robot doraemon = new Robot();
		doraemon.robotName = "ドラえもん";
		doraemon.talk();
		doraemon.walk();
		doraemon.run();
		System.out.println();

	}

}
