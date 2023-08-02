import com.iweb.DAO.UserDAO;
import com.iweb.DAO.impl.UserDAOImpl;
import com.iweb.bean.User;
import com.iweb.util.MD5Util;
import com.iweb.util.UUIDUtil;
import org.junit.Test;

/**
 * @Author 小火煮粥
 * @date 2023/8/1 23:16
 * @WeChat xhzz211423
 */


public class JuTest {
    @Test
    public void test(){
        UserDAO userDAO=new UserDAOImpl();
        userDAO.addUser(new User(UUIDUtil.uuid(),"jsp", MD5Util.getMD5("123")));
    }
}
