package Pi2;

// 파이값의 계산을 위한 클래스
public class ParentPoint implements Runnable{
	CountNum count;
	
	public ParentPoint(CountNum c) {
		this.count = c;
	}
	
	@Override
	public void run() {
	
		// (원 안에 찍힌 좌표) / (사각형 안의 모든 좌표) * 4를 실수형으로 형 변환 
		double i = 4*((double)count.circleCount/(double)count.count);
		System.out.println("실행 횟수: " + count.count);
		System.out.println("π의 값: " + i);
	}
}
