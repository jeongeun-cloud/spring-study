package test;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component("board")
public class Board {
	private Conn conn;
	
	@PostConstruct
	public void connection() {
		System.out.println("���� ����");
		conn = new Conn();
	}
	
	public void boardWrite() {
//		this.connection();
		System.out.println("�۾��� ó��");
//		this.close();
	}
	
	@PreDestroy
	public void close() {
		System.out.println("���� ����");
		conn = null;
	}
}
