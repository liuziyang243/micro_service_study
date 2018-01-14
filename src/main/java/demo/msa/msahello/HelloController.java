package demo.msa.msahello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liuziyang
 * Create date: 2018/1/14
 */

@RestController
public class HelloController {
    @RequestMapping(method = RequestMethod.GET,path = "/hello")
    public String hello() {
        return "hello world";
    }
}
