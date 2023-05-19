package chap03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import chap02.AppCtx;
public class Main2 {
	public static void main(String[] args) {
//1.ApplicationContext(컨테이너) 객체 생성 다른 객체들을 가지고있으니깐 컨테이너
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx2.class);
//2. chap02.SystemMonitor 객체를 컨테이너에서 조회하여 monitor 변수 저장하기
//3. monitor 콘솔 출력하기
		SystemMonitor monitor = ctx.getBean("monitor",SystemMonitor.class);
		System.out.println(monitor.toString());
		SystemMonitor m = new SystemMonitor();
	}
	
}
