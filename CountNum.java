package Pi2;

// 데이터 공유를 위한 클래스
public class CountNum {
	// 실행 횟수
	int count = 0;
	// 원안에 들어온 점의 개수
	int circleCount = 0;
	
	// 동시 실행을 막는 동기화 메소드
	public synchronized void countUp() {
		count++;
	}
	public synchronized void circleUp() {
		circleCount++;
	}
}
