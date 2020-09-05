package gold.jiaxin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO
 *
 * @author yanxiaodong
 * @version 1.0
 * @date 2020/9/5 23:12
 */
@RestController
@RequestMapping("/demo")
public class DemoController {
    @GetMapping("hello")
    public String hello() {
        return "hello michael";
    }
}
