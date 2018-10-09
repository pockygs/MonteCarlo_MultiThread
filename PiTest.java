package Pi2;

// 실행 클래스
public class PiTest {
	public static void main(String args[]) {
		// 데이터 공유를 위한 클래스 객체 생성
		CountNum number = new CountNum();
		// 좌표 생성을 위한 클래스 객체 생성
		MultPoint mt = new MultPoint(number);
		// 결과 값을 출력하는 부모 클래스 객체 생성
		ParentPoint pt = new ParentPoint(number);
		
		// MultPoint 객체의 스레드 4개 생성
		Thread tr1 = new Thread(mt);
		Thread tr2 = new Thread(mt);
		Thread tr3 = new Thread(mt);
		Thread tr4 = new Thread(mt);
		
		// ParentPoint 객체의 스레드 1개 생성
		Thread pTr = new Thread(pt);
		
		// MultPoint 스레드 실행
		tr1.start();
		tr2.start();
		tr3.start();
		tr4.start();
		
		// 다른 스레드의 실행이 마무리 될 때 까지 기다린다
		try {
			tr1.join();
			tr2.join();
			tr3.join();
			tr4.join();
		}catch(Exception e) {e.printStackTrace();}
		
		// ParentPoint의 스레드 pTr 실행
		pTr.start();
	}
}
