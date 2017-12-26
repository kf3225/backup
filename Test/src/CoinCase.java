/**
 * 
 */

/**
 * @author internousdev
 *
 */
public class CoinCase {
	private int _500yen = 0;
	private int _100yen = 0;
	private int _50yen = 0;
	private int _10yen = 0;
	private int _5yen = 0;
	private int _1yen = 0;
	
	private int add500yen = 0;
	private int add100yen = 0;
	private int add50yen = 0;
	private int add10yen = 0;
	private int add5yen = 0;
	private int add1yen = 0;
	
	public void setCoin500(int _500yen){
		this._500yen = _500yen;
	}
	public void setCoin100(int _100yen){
		this._100yen = _100yen;
	}
	public void setCoin50(int _50yen){
		this._50yen = _50yen;
	}
	public void setCoin10(int _10yen){
		this._10yen = _10yen;
	}
	public void setCoin5(int _5yen){
		this._5yen = _5yen;
	}
	public void setCoin1(int _1yen){
		this._1yen = _1yen;
	}
	
	public void setAdd500(int add500yen){
		this.add500yen = add500yen;
	}
	public void setAdd100(int add100yen){
		this.add100yen = add100yen;
	}
	public void setAdd50(int add50yen){
		this.add50yen = add50yen;
	}
	public void setAdd10(int add10yen){
		this.add10yen = add10yen;
	}
	public void setAdd5(int add5yen){
		this.add5yen = add5yen;
	}
	public void setAdd1(int add1yen){
		this.add1yen = add1yen;
	}
	
	public int getCoin500(){
		return this._500yen;
	}
	public int getCoin100(){
		return this._100yen;
	}
	public int getCoin50(){
		return this._50yen;
	}
	public int getCoin10(){
		return this._10yen;
	}
	public int getCoin5(){
		return this._5yen;
	}
	public int getCoin1(){
		return this._1yen;
	}
	
	public void sum500(){
		System.out.print("500円 : " + (this._500yen + this.add500yen) + "枚");
		System.out.println("（" + (this._500yen + this.add500yen) * 500 + "円）");
	}
	public void sum100(){
		System.out.print("100円 : " + (this._100yen + this.add100yen) + "枚");
		System.out.println("（" + (this._100yen + this.add100yen) * 100 + "円）");
	}
	public void sum50(){
		System.out.print("50円 : " + (this._50yen + this.add50yen) + "枚");
		System.out.println("（" + (this._50yen + this.add50yen) * 50 + "円）");
	}
	public void sum10(){
		System.out.print("10円 : " + (this._10yen + this.add10yen) + "枚");
		System.out.println("（" + (this._10yen + this.add10yen) * 10 + "円）");
	}
	public void sum5(){
		System.out.print("5円 : " + (this._5yen + this.add5yen) + "枚");
		System.out.println("（" + (this._5yen + this.add5yen) * 5 + "円）");
	}
	public void sum1(){
		System.out.print("1円 : " + (this._1yen + this.add1yen) + "枚");
		System.out.println("（" + (this._1yen + this.add1yen) * 1 + "円）");
	}

}