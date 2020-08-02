import com.gbq.config.AppConfig;
import com.gbq.mapper.UserMapper;
import com.gbq.pojo.User;
import com.gbq.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // 获取自己注册的bean
        User user = context.getBean("local", User.class);
        System.out.println(user);

        // 测试FactoryBean
        UserService user1 = context.getBean("userService", UserService.class);
        user1.show();



    }
}
