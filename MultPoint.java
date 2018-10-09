package Pi2;

import java.util.Random;

// 좌표 생성을 위한 클래스
public class MultPoint implements Runnable{
	CountNum count;
	
	// 랜덤 함수 사용
	Random ran = new Random();

	public MultPoint(CountNum c) {
		this.count = c;
	}
	
	@Override
	public void run() {
		for(int i=0;i<2500000;i++) {
			
			// -1~1 까지 값 중 랜덤하게 생성
			double x = ran.nextFloat()*2-1;
			double y = ran.nextFloat()*2-1;
			
			// 원의 중점과 좌표 사이의 거리
			double result = (x*x) + (y*y);
			
			// result가 1보다 같거나 작으면 원 안의 점
			if(result <= 1)
				count.circleUp();	
			
			// 실행 횟수 증가
			count.countUp();
		}
	}
}
