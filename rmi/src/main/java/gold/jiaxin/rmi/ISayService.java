package gold.jiaxin.rmi;

import java.rmi.Remote;

/**
 * TODO
 *
 * @author yanxiaodong
 * @version 1.0
 * @date 2020/9/5 10:47
 */
public interface ISayService extends Remote {
    String say(String name) throws Exception;
}
