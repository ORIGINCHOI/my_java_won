package test.mypac;

public class Rect {
	//필드 2개
	public int width;
	
	public int height;
	//메소드
	public void showArea() {
		int area = this.width * this.height;
		System.out.println("면적은:"+area+" 입니다.");
	}
}
