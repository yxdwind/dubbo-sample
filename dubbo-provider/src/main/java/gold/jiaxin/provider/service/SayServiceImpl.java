package gold.jiaxin.provider.service;


import org.apache.dubbo.config.annotation.DubboService;

/**
 * TODO
 *
 * @author yanxiaodong
 * @version 1.0
 * @date 2020/9/5 12:20
 */
@DubboService(version = "1.0.0", timeout = 10000, interfaceClass = ISayService.class)
public class SayServiceImpl implements ISayService {
    @Override
    public void say(String name) {
        System.out.println("hi," + name);
    }
}
