package gold.jiaxin.controller;

import gold.jiaxin.service.ISayService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
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
@RequestMapping("/rest")
public class MainController {

    @DubboReference(version = "1.0.0")
    ISayService iSayService;

    @GetMapping("say")
    public String say() {
        iSayService.say("michael");
        return "michael";
    }
    @GetMapping("hello")
    public String hello() {

        return "hello michael";
    }

}
