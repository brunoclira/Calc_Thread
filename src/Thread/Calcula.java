package Thread;

public class Calcula {

	private float num1;
	private float num2;
	
	public Calcula(){
		num1 = 0;
		num2 = 0;
	}
	
	public void setNum1(float num1) {
		this.num1 = num1;
	}
	
	public void setNum2(float num2) {
		this.num2 = num2;
	}
	
	public float getSubtracao() {
		return (num1 - num2);
	}
	
	public float getSoma() {
		return (num1 + num2);
	}
	
	public float getDivisao(){
		return (num1 / num2);
	}
	
	public float getMultiplicacao(){
		return (num1 * num2);
	}
		
}
