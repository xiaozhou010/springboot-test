package test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by DELL on 2017/1/19.
 */
@RestController
@RequestMapping
public class TestContraller {

    @RequestMapping("/hello")
    public Object hello(){
        return "hello world";
    }
}
