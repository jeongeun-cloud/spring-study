package part4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext ac = new GenericXmlApplicationContext("spring/context4.xml");

//		Board b = ac.getBean("board", Board.class);
//		Board b2 = ac.getBean("board", Board.class);
		System.out.println("b = " + ac.getBean("board"));
		System.out.println("b2 = " + ac.getBean("board"));
		System.out.println("b3 = " + ac.getBean("board"));
		System.out.println("w = " + ac.getBean("write"));
		System.out.println("w2 = " + ac.getBean("write"));
		System.out.println("w3 = " + ac.getBean("write"));
//		Board board = ac.getBean("board", Board.class);
//		board.boardWrite();
	}
}
