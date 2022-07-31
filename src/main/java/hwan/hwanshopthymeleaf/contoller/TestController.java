package hwan.hwanshopthymeleaf.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

    @GetMapping(value = "/test")
    public String testMethod() {
        return "test";
    }

    @GetMapping("/item/add")
    public String itemMethod() {
        return "add";
    }

    @GetMapping(value = "/item/insert")
    public String insertDB(Model model){
        model.addAttribute("name,", "hwan");
        model.addAttribute("itemName", "초코파이");
        model.addAttribute("price",3000);
        return "add";
    }
}

