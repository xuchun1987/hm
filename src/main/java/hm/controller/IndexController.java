package hm.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xuchun on 2017/2/27.
 */
@RequestMapping("/index")
@RestController
public class IndexController {


    @RequestMapping("/index")
    public String index(){
        return "xxxx";
    }
}
