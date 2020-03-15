package doubleAss.pijama.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import doubleAss.pijama.entity.Contact;

@RestController
public class ApiController {


    @RequestMapping(path = "/hello")
    public List<Contact> sayHello() {
        var contact = new Contact();
        contact.setId(1);
        contact.setName("asdsad");
        var contact2 = new Contact();
        contact.setId(2);
        contact.setName("nhatnm11");
        ArrayList<Contact> listContact = new ArrayList<Contact>();
        listContact.add(contact);
        listContact.add(contact2);
        return listContact;
    }
    
}
