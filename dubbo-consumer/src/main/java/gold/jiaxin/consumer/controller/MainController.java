package gold.jiaxin.consumer.controller;

import gold.jiaxin.consumer.service.ISayService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO
 *
 * @author yanxiaodong
 * @version 1.0
 * @date 2020/9/5 12:33
 */
@RestController
@RequestMapping("main")
public class MainController {

    @DubboReference(version = "1.0.0")
    ISayService iSayService;

    @RequestMapping("/say")
    public void say() {
        iSayService.say("michael");
    }
}
