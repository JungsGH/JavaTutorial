package OOP;

class Calculator {
	int left, right; // this.left, this.right가 가르키는 변수
	
	public void setOprands(int left, int right) {
		this.left = left;	
		this.right = right;
	}
	
	public void sum() {
		System.out.println(this.left + this.right);
	}
	
	public void avg() {
		System.out.println((this.left + this.right)/2);
	}
}
	
public class CalculatorDemo {
	public static void main(String[] args) {
		Calculator c1 = new Calculator();	// Calculator라는 객체를 c1이라는 이름으로 생성 (== 인스턴스 생성)
		c1.setOprands(10, 20);	
		c1.sum();
		c1.avg();
		
		Calculator c2 = new Calculator();
		c2.setOprands(20, 40);
		c2.sum();
		c2.avg();
	}
	
}

