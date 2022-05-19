package trunk;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mvst.edu.dao.MemberDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"classpath:config/spring/context-*.xml"
})
public class MemeberDaoTest {
	
	@Inject
	private MemberDAO memberDao;
	
	@Test
	public void test() {
		memberDao.test(null);
	}

}
