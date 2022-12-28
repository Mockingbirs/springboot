package proj.projspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/thymeleaf")
public class ThymeleafExController {

    @GetMapping(value = "/ex03")
    public String thymeleafEx03(){
        return "thymeleaf/thymeleaf03";
    }

    @GetMapping(value = "/ex04")
    public String thymeleafEx04(){
       return  "thymeleaf/thymeleaf04";
    }

    @GetMapping(value = "/ex05")
    public String thymeleafEx05(String param1, String param2, Model model){
        model.addAttribute("param1",param1);
        model.addAttribute("param2",param2);
        return  "thymeleaf/thymeleaf05";
    }
}
