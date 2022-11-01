package test.main;

import test.mypac.MyWeapon;
import test.mypac.Weapon;

public class TestMain {
	public static void main(String[] args) {
		// Weapon type 의 참조값을 담을 수 있는 w 라는 지역변수 만들기(w 는 아직 빈상태)
		//Weapon w = null;
		Weapon w = new MyWeapon();
		w.prepare();
		w.attack();
	}
}
