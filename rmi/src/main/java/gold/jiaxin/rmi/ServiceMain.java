package gold.jiaxin.rmi;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

/**
 * TODO
 *
 * @author yanxiaodong
 * @version 1.0
 * @date 2020/9/5 10:51
 */
public class ServiceMain {
    public static void main(String[] args) throws Exception {
        //实例化  要暴露给远程的方法/接口
        ISayService impl = new SayServiceImpl();
        //开启本地服务
        ISayService sayService = (ISayService) UnicastRemoteObject.exportObject(impl, 666);
        //服务注册中心
        Registry registry = LocateRegistry.createRegistry(999);
        //注册服务
        registry.rebind("sayService", sayService);

    }
}
