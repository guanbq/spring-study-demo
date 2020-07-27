import com.gbq.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.add();

    }
}