
public class Sub {
	private double num1 = 0;
	private double num2 = 0;
	
	public void setNum1(double num1){
		this.num1 = num1;
	}
	public void setNum2(double num2){
		this.num2 = num2;
	}
	
	public double getAvg(){
		return (this.num1 + this.num2) / 2;
	}
}