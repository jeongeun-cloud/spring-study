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
		// 모두 삭제 한 후
		udao.deleteAll();
		
		assertTrue(udao.selectAllUsers().size() == 0);
		
		// 한명 기본 값 넣기
		user = new User("asdf","1234","주정은","aaa@aaa.com");
		assertTrue(udao.insertUser(user) == 1);
		assertTrue(udao.selectAllUsers().size() == 1);
	}

//	Insert Test
//	@Test
	public void insertTest() throws Exception {
		int cnt = udao.selectAllUsers().size();
		
		// pk값이 null이어서 쿼리가 오류가 나서 0을 반환해야 함
		user = new User(null,"1234","주정은","aaa@aaa.com");
		assertTrue(udao.insertUser(user) == 0);
		assertTrue(cnt == udao.selectAllUsers().size());
		
		// not null 컬럼에 null을 넣어서 쿼리가 오류가 나서 0을 반환해야 함
		user = new User("qqqq",null,"주정은","aaa@aaa.com");
		assertTrue(udao.insertUser(user) == 0);
		assertTrue(cnt == udao.selectAllUsers().size());
		
		// not null 컬럼에 null을 넣어서 쿼리가 오류가 나서 0을 반환해야 함
		user = new User("qqqq","1234",null,"aaa@aaa.com");
		assertTrue(udao.insertUser(user) == 0);
		assertTrue(cnt == udao.selectAllUsers().size());
		
		// not null 컬럼에 null을 넣어서 쿼리가 오류가 나서 0을 반환해야 함
		user = new User("qqqq","1234","주정은",null);
		assertTrue(udao.insertUser(user) == 0);
		assertTrue(cnt == udao.selectAllUsers().size());
		
		// id는 pk라 unique해야 하기 때문에 쿼리가 오류가 나서 0을 반환해야 함
		user = new User("asdf","1234","주정은","aaa@aaa.com");
		assertTrue(udao.insertUser(user) == 0);
		assertTrue(cnt == udao.selectAllUsers().size());
		
		// success - 정상적인 쿼리 
		user = new User("test","1234","주정은","aaa@aaa.com");
		assertTrue(udao.insertUser(user) == 1);
		assertTrue(user.getId().equals("test"));
		assertTrue(cnt == udao.selectAllUsers().size()+1);
		
		user = new User("test1","1234","주정은","aaa@aaa.com");
		assertTrue(udao.insertUser(user) == 1);
		assertTrue(user.getId().equals("test1"));
		assertTrue(cnt == udao.selectAllUsers().size()+2);
		
		user = new User("test2","1234","주정은","aaa@aaa.com");
		assertTrue(udao.insertUser(user) == 1);
		assertTrue(user.getId().equals("test2"));
		assertTrue(cnt == udao.selectAllUsers().size()+3);
		
		user = new User("test3","1234","주정은","aaa@aaa.com");
		assertTrue(udao.insertUser(user) == 1);
		assertTrue(user.getId().equals("test3"));
		assertTrue(cnt == udao.selectAllUsers().size()+4);
		
		// 다 들어간 사이즈가 다섯개 
		assertTrue(udao.selectAllUsers().size() == 5);
	}
	

	
//	Select Test
//	@Test
	public void selectTest() throws Exception {
		// 없는 id를 넣어서 결과를 null로 반환해야 함
		user = udao.selectUser("hello");
		assertTrue(user == null);
		
		// success - 정상적인 쿼리 
		user = udao.selectUser("test");
		assertTrue(user.getId().equals("test"));
		assertTrue(user != null);
	}


	
//	Delete Test
//	@Test
	public void deleteTest() throws Exception {
		int cnt;
		// 없는 id를 넣어서 삭제할 로우가 없어서 쿼리 결과가 0이 나와야함
		cnt = udao.deleteUser("hello");
		assertTrue(cnt == 0);
		
		// id에 null을 넣어서 쿼리 오류로 결과가 0이 나와야함
		cnt = udao.deleteUser(null);
		assertTrue(cnt == 0);
		
		// success - 정상적인 쿼리 
		cnt = udao.deleteUser("asdf");
		assertTrue(cnt == 1);
		
	}


	
//	Update Test
//	@Test
	public void updateTest() throws Exception {
		int cnt;
		// not null 컬럼에 null을 넣어서 쿼리가 오류가 나서 0을 반환해야 함
		user = new User("asdf",null,null,null);
		cnt = udao.updateUser(user);
		assertTrue(cnt == 0);
		
		// 없는 id를 넣어서 갱신할 로우가 없어서 쿼리 결과가 0이 나와야함
		user = new User("hello","1234","주정은","aaa@aaa.com");
		cnt = udao.updateUser(user);
		assertTrue(cnt == 0);
		
		// success - 정상적인 쿼리 
		user = new User("test","4567","주정은","bbb@ccc.com");
		cnt = udao.updateUser(user);
		assertTrue(cnt == 1);
		assertTrue(user.getPwd().equals("4567"));
		assertTrue(user.getEmail().equals("bbb@ccc.com"));
	}
	
	
//	SelectAll Test
//	@Test
	public void selectAllTest() throws Exception {
		// success - 정상적인 쿼리 
		List<User> list = udao.selectAllUsers();
		assertTrue(list.size() == 4);
	}
	
}
