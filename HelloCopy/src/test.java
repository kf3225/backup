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
		Person taro=new Person();
		taro.name="山田太郎";
		taro.age=20;
		taro.phoneNumber="080-1111-1111";
		taro.prefecture="東京";
		
		System.out.println(taro.name);
		System.out.println(taro.age+"歳");
		System.out.println(taro.phoneNumber);
		System.out.println(taro.prefecture);
		taro.talk();
		taro.walk();
		taro.run();
		
		System.out.println("\n");


		Person jiro=new Person();
		jiro.name="木村次郎";
		jiro.age=18;
		jiro.phoneNumber="080-2222-2222";
		jiro.prefecture="神奈川";
		
		System.out.println(jiro.name);
		System.out.println(jiro.age+"歳");
		System.out.println(jiro.phoneNumber);
		System.out.println(jiro.prefecture);
		jiro.talk();
		jiro.walk();
		jiro.run();
		
		System.out.println("\n");
		

		Person hanako=new Person();
		hanako.name="鈴木花子";
		hanako.age=16;
		hanako.phoneNumber="080-3333-3333";
		hanako.prefecture="千葉";
		
		System.out.println(hanako.name);
		System.out.println(hanako.age+"歳");
		System.out.println(hanako.phoneNumber);
		System.out.println(hanako.prefecture);
		hanako.talk();
		hanako.walk();
		hanako.run();
		
		System.out.println("\n");
		
		
		Robot aibo=new Robot();
		aibo.robotname="Aibo";
		
		System.out.println(aibo.robotname);
		aibo.talk();
		aibo.walk();
		aibo.run();
		
		System.out.println("\n");
		
		
		Robot asimo=new Robot();
		asimo.robotname="Asimo";
		asimo.talk();
		asimo.walk();
		asimo.run();
		
		System.out.println("\n");
		
		
		Robot pepper=new Robot();
		pepper.robotname="Pepper";
		pepper.talk();
		pepper.walk();
		pepper.run();
		
		System.out.println("\n");
		
		Robot doraemon=new Robot();
		doraemon.robotname="ドラえもん";
		doraemon.talk();
		doraemon.walk();
		doraemon.run();
		
		
		
		
		

	}

}
