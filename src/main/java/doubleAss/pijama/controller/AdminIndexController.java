package doubleAss.pijama.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/adm")
public class AdminIndexController {

    @GetMapping({"", "/index"})
    public String index() {
        return "admin/index";
    }

    @GetMapping({"/contact"})
    public String contact() {
        return "admin/tables-contact";
    }

}
