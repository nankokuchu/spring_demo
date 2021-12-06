import com.atzzazz.controller.UserController;
import com.atzzazz.model.ResultInfo;
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

        UserController userController = context.getBean("userController", UserController.class);
        ResultInfo resultInfo = userController.userLogin("admin", "123");
        System.out.println(resultInfo);
    }
}
