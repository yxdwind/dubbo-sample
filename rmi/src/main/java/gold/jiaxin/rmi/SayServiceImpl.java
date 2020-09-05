package gold.jiaxin.rmi;

/**
 * 远程服务
 *
 * @author yanxiaodong
 * @version 1.0
 * @date 2020/9/5 10:43
 */
public class SayServiceImpl implements ISayService {
    @Override
    public String say(String name) {
        System.out.println(name + "say: hello");
        return "服务端："+name + " say: hello";
    }
}
