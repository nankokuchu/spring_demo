import com.atzzazz.dao.UserDao;
import com.atzzazz.factory.InstanceFactory;
import com.atzzazz.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description：
 * @Author： zzazz
 * @Date： 2021/12/6 - 12:07
 */
public class Starter {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
//        UserService userService = (UserService) context.getBean("userService");
//        userService.printUserService();
        UserService userService = context.getBean("userService", UserService.class);
        userService.printUserService();
    }
}
