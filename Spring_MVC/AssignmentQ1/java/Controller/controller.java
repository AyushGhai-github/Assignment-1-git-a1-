package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class controller {

    @RequestMapping("/HELLO")
    public String helloWorld(){
        return "HELLO";
    }
}
