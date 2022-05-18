package d0518_1.controller;

import d0518_1.DTO.tDTO;
import d0518_1.service.tService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class tController {
    @Autowired
    tService ts;




    @GetMapping("/")
    String index(){
        return "index";
    }
    @GetMapping("/save-form")
    String form(){
        return "save-form";
    }


    @PostMapping("/save")
    void save(@RequestParam("name")String name,@RequestParam("age")int age){
        ts.save(name,age);
    }

    @PostMapping("/save2")
    void save2(@ModelAttribute tDTO tdto){
        ts.save2(tdto);
    }
}
