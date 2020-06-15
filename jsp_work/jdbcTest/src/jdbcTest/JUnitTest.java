package jdbcTest;

import static org.junit.Assert.*;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class JUnitTest {
	UserDao udao = UserDao.getInstance();
	User user;
	
	
//	@Test
	public void delAllTest() throws Exception {
		// ��� ���� �� ��
		udao.deleteAll();
		
		assertTrue(udao.selectAllUsers().size() == 0);
		
		// �Ѹ� �⺻ �� �ֱ�
		user = new User("asdf","1234","������","aaa@aaa.com");
		assertTrue(udao.insertUser(user) == 1);
		assertTrue(udao.selectAllUsers().size() == 1);
	}

//	Insert Test
//	@Test
	public void insertTest() throws Exception {
		int cnt = udao.selectAllUsers().size();
		
		// pk���� null�̾ ������ ������ ���� 0�� ��ȯ�ؾ� ��
		user = new User(null,"1234","������","aaa@aaa.com");
		assertTrue(udao.insertUser(user) == 0);
		assertTrue(cnt == udao.selectAllUsers().size());
		
		// not null �÷��� null�� �־ ������ ������ ���� 0�� ��ȯ�ؾ� ��
		user = new User("qqqq",null,"������","aaa@aaa.com");
		assertTrue(udao.insertUser(user) == 0);
		assertTrue(cnt == udao.selectAllUsers().size());
		
		// not null �÷��� null�� �־ ������ ������ ���� 0�� ��ȯ�ؾ� ��
		user = new User("qqqq","1234",null,"aaa@aaa.com");
		assertTrue(udao.insertUser(user) == 0);
		assertTrue(cnt == udao.selectAllUsers().size());
		
		// not null �÷��� null�� �־ ������ ������ ���� 0�� ��ȯ�ؾ� ��
		user = new User("qqqq","1234","������",null);
		assertTrue(udao.insertUser(user) == 0);
		assertTrue(cnt == udao.selectAllUsers().size());
		
		// id�� pk�� unique�ؾ� �ϱ� ������ ������ ������ ���� 0�� ��ȯ�ؾ� ��
		user = new User("asdf","1234","������","aaa@aaa.com");
		assertTrue(udao.insertUser(user) == 0);
		assertTrue(cnt == udao.selectAllUsers().size());
		
		// success - �������� ���� 
		user = new User("test","1234","������","aaa@aaa.com");
		assertTrue(udao.insertUser(user) == 1);
		assertTrue(user.getId().equals("test"));
		assertTrue(cnt == udao.selectAllUsers().size()+1);
		
		user = new User("test1","1234","������","aaa@aaa.com");
		assertTrue(udao.insertUser(user) == 1);
		assertTrue(user.getId().equals("test1"));
		assertTrue(cnt == udao.selectAllUsers().size()+2);
		
		user = new User("test2","1234","������","aaa@aaa.com");
		assertTrue(udao.insertUser(user) == 1);
		assertTrue(user.getId().equals("test2"));
		assertTrue(cnt == udao.selectAllUsers().size()+3);
		
		user = new User("test3","1234","������","aaa@aaa.com");
		assertTrue(udao.insertUser(user) == 1);
		assertTrue(user.getId().equals("test3"));
		assertTrue(cnt == udao.selectAllUsers().size()+4);
		
		// �� �� ����� �ټ��� 
		assertTrue(udao.selectAllUsers().size() == 5);
	}
	

	
//	Select Test
//	@Test
	public void selectTest() throws Exception {
		// ���� id�� �־ ����� null�� ��ȯ�ؾ� ��
		user = udao.selectUser("hello");
		assertTrue(user == null);
		
		// success - �������� ���� 
		user = udao.selectUser("test");
		assertTrue(user.getId().equals("test"));
		assertTrue(user != null);
	}


	
//	Delete Test
//	@Test
	public void deleteTest() throws Exception {
		int cnt;
		// ���� id�� �־ ������ �ο찡 ��� ���� ����� 0�� ���;���
		cnt = udao.deleteUser("hello");
		assertTrue(cnt == 0);
		
		// id�� null�� �־ ���� ������ ����� 0�� ���;���
		cnt = udao.deleteUser(null);
		assertTrue(cnt == 0);
		
		// success - �������� ���� 
		cnt = udao.deleteUser("asdf");
		assertTrue(cnt == 1);
		
	}


	
//	Update Test
//	@Test
	public void updateTest() throws Exception {
		int cnt;
		// not null �÷��� null�� �־ ������ ������ ���� 0�� ��ȯ�ؾ� ��
		user = new User("asdf",null,null,null);
		cnt = udao.updateUser(user);
		assertTrue(cnt == 0);
		
		// ���� id�� �־ ������ �ο찡 ��� ���� ����� 0�� ���;���
		user = new User("hello","1234","������","aaa@aaa.com");
		cnt = udao.updateUser(user);
		assertTrue(cnt == 0);
		
		// success - �������� ���� 
		user = new User("test","4567","������","bbb@ccc.com");
		cnt = udao.updateUser(user);
		assertTrue(cnt == 1);
		assertTrue(user.getPwd().equals("4567"));
		assertTrue(user.getEmail().equals("bbb@ccc.com"));
	}
	
	
//	SelectAll Test
//	@Test
	public void selectAllTest() throws Exception {
		// success - �������� ���� 
		List<User> list = udao.selectAllUsers();
		assertTrue(list.size() == 4);
	}
	
}
