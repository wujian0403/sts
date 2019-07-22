package forum;

import java.util.Map;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.accp.forum.biz.ArticleBiz;
import com.accp.forum.biz.UserBiz;
import com.accp.forum.pojo.Article;
import com.accp.forum.util.MD5Signature;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:/spring-ctx.xml" })
public class ArticleTest {
	@Autowired
	private ArticleBiz biz;
	@org.junit.Test
	public void Test() {
		Article a = biz.getArticleById(1);
		System.out.println(a.toString());
	}
}
