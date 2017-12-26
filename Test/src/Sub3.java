/**
 * 
 */

/**
 * @author internousdev
 *
 */
public class Sub3 {
	private String name = null;
	private int age = 0;
	private String kind = null;
	
	public void setName(String name){
		this.name = name;
	}
	public void setAge(int age){
		this.age = age;
	}
	public void setKind(String kind){
		this.kind = kind;
	}
	
	public void showProfile(){
		System.out.println("Name : " + this.name);
		System.out.println("Age : " + this.age);
		System.out.println("Kind : " + this.kind);
	}

}
