package forum;

import java.util.Map;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.accp.forum.biz.UserBiz;
import com.accp.forum.pojo.User;
import com.accp.forum.util.MD5Signature;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:/spring-ctx.xml" })
public class UserTest {

	@Autowired
	private UserBiz biz;
	@org.junit.Test
	public void Test() {
		Map<String, Object> map = biz.getMap("E2019001", MD5Signature.md5("123456"));
		System.out.println(map.get("code"));
	}
}
