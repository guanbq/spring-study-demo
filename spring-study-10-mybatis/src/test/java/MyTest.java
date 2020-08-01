import com.gbq.mapper.UserMapper;
import com.gbq.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MyTest {

    @Test
    public void test01() throws IOException {
       /* String resource = "mybatis-config.xml";
        InputStream in = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
        SqlSession sqlSession = sqlSessionFactory.openSession(true);

        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = userMapper.selectUser();
        for (User user : users) {
            System.out.println(user);
        }*/

        ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
        UserMapper userMapperImpl = context.getBean("userMapperImpl", UserMapper.class);
        List<User> userList = userMapperImpl.selectUser();
        for (User user : userList) {
            System.out.println(user);
        }


    }
}
