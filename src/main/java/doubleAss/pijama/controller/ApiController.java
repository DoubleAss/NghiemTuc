package doubleAss.pijama.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import doubleAss.pijama.entity.Contact;

@RestController
public class ApiController {


    @RequestMapping(path = "/hello")
    public Contact sayHello() {
        var contact = new Contact();
        contact.setId(1);
        contact.setName("asdsad");
        return contact;
    }
    
}
