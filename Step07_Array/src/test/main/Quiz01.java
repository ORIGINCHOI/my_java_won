package test.main;

import java.util.Random;

public class Quiz01 {
	public static void main(String[] args) {
		/*
		 * 1.run 했을 때
		 *   cherry, apple, banana, melon, 7
		 *   5개의 문자열 중에서 1개가 랜덤하게 출력되게 해 보세요.
		 */   
		//문자열 여러개를 순서있게 관리하기 위한 객체
		String[] items={"cherry", "apple", "banana", "melon", "7"};
		//랜덤한 숫자를 얻어내기 위한 객체
		Random ran = new Random();
		// 0~4 사이의 랜덤한 숫자를 하나 얻어내서
		int ranNum=ran.nextInt(5);
		// 배열의 인덱스로 활용해서 문자열 출력하기
		System.out.println(items[ranNum]);
		
		/* 2.run 했을 때
		 *   5개의 문자열 중에서 3개가 한줄에 한번에 랜덤하게 출력되게 해 보세요.
		 *   예) cherry | apple | cherry
		 *      7 | apple | melon
		 *      7 | 7 | 7
		 *      
		 *  - hint
		 *  
		 *  String[] items={"cherry", "apple", "banana", "melon", "7"};
		 *  
		 *  Random ran = new Random();
		 *  int ranNum=ran.nextInt(5);
		 */
		int ranNum2=ran.nextInt(5);
		int ranNum3=ran.nextInt(5);
		String a=items[ranNum];
		String b=items[ranNum2];
		String c=items[ranNum3];
		System.out.println(a+" | "+b+" | "+c);
		if(a == b && a==c && b==c) {
		System.out.println("축하드립니다! 운이 좋으시네요!");
		}else if(a == b || a==c || b==c) {
			System.out.println("조금 아쉬워요~");
		}else {
			System.out.println("운이 정말 없으시네요~");
		}
	}
}
