package test.main;

import test.auto.Engine;
import test.auto.SuperCar;

public class DreamMain {
	public static void main(String[] args) {
		SuperCar s1=new SuperCar(new Engine());
		s1.drive();
		s1.fast();
		s1.expensive();
	}
}
