package gold.jiaxin.rmi;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * TODO
 *
 * @author yanxiaodong
 * @version 1.0
 * @date 2020/9/5 11:21
 */
public class CustomerMain {
    public static void main(String[] args) throws Exception {
        //注册中心
        Registry registry = LocateRegistry.getRegistry(999);
        //发现服务
        ISayService sayService = (ISayService) registry.lookup("sayService");
        //调起服务
        String str = sayService.say("John");
        System.out.println("客户端：" + str);


    }
}
