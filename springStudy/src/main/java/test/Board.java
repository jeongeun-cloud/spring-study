package test;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component("board")
public class Board {
	private Conn conn;
	
	@PostConstruct
	public void connection() {
		System.out.println("연결 실행");
		conn = new Conn();
	}
	
	public void boardWrite() {
//		this.connection();
		System.out.println("글쓰기 처리");
//		this.close();
	}
	
	@PreDestroy
	public void close() {
		System.out.println("연결 해제");
		conn = null;
	}
}
