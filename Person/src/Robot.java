/**
 *
 */

/**
 * @author internousdev
 *
 */
public class Robot {
	public String robotName = null;
	public void talk(){
		System.out.println(this.robotName + "が話す");
	}
	public void walk(){
		System.out.println(this.robotName + "が歩く");
	}
	public void run(){
		System.out.println(this.robotName + "が走る");
	}
}
