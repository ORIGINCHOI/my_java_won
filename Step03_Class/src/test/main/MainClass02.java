package test.main;

import test.mypac.MyUtil;

public class MainClass02 {
	private void name() {
		//static 메소드는 클래스명에 . 찍어서 바로 호출할 수 있다.
		MyUtil.send();
		// static 필드는 클래스명에 . 찍어서 바로 참조할 수 있다.
		MyUtil.version="1.0";
	}
}
