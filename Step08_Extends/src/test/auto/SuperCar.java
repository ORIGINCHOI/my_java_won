package test.auto;

public class SuperCar extends Car{
	public SuperCar(Engine engine) {
		super(engine);
	}
	
	public void expensive() {
		System.out.println("비싸요");
	}
	
	public void fast() {
		System.out.println("빨라요");
	}
}
