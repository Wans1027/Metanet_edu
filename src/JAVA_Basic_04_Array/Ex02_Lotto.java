package JAVA_Basic_04_Array;

import JAVA_Basic_04_Array.kr.or.kosa.Lotto;

/*
1. 1~45 까지의 난수를 발생시켜서 6개의 정수값을 배열에 담으세요
2. 배열에 담긴 6개의 배열값은 중복값이 나오면 안되요 (중복값 검증)
3. 배열에 있는 6개의 값은 낮은 순으로 정렬 시키세요(정렬 : 자리바꿈 : swap)
4. 위 결과를 담고있는 배열을 출력하세요


별도의 Lotto.java 클래스를 만드시고 ... 
클래스 어러우면 main 함수 안에서 ....
*/
public class Ex02_Lotto {

	public static void main(String[] args) {
		Lotto lotto = new Lotto();
		lotto.runLotto();
	}

}
