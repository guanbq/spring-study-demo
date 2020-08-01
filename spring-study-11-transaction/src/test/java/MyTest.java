import com.gbq.mapper.UserMapper;
import com.gbq.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.util.List;

public class MyTest {
    @Test
    public void test01() throws IOException {

        ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");

        UserMapper userMapperImplTwo = context.getBean("userMapperImplTwo", UserMapper.class);
        List<User> userList = userMapperImplTwo.selectUser();
        for (User user : userList) {
            System.out.println(user);
        }
    }

}
