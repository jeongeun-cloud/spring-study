package test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ConfigurableApplicationContext ac = new GenericXmlApplicationContext("spring/context-test.xml");
		
		Board board = ac.getBean("board", Board.class);
		board.boardWrite();
		ac.close();
	}
}
