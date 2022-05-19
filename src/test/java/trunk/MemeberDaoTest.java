package trunk;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mvst.edu.dao.MemberDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/resources/config/sping/context-*.xml")
public class MemeberDaoTest {
	
	private MemberDAO memberDao;
	
	public MemeberDaoTest(MemberDAO memberDao) {
		this.memberDao = memberDao;
	}
	
	@Test
	public void test() {
		memberDao.test("짱구");
	}

}
