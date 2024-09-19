package vendorproject.javaproject.controller;

import org.springframework.web.bind.annotation.*;
import vendorproject.javaproject.model.Cloudvendor;

@RestController
@RequestMapping("/vendorpath")
public class Vendorapis {
    Cloudvendor cloudvendor;
    @GetMapping("{vendorid}")
    public Cloudvendor getdetails(String vendorid){
        return cloudvendor;
    }
    @GetMapping("/hello")
    public String hello(){
        return "hellospringboot";
    }
    @PostMapping
    public String postdetails(@RequestBody Cloudvendor cloudvendor){
        this.cloudvendor=cloudvendor;
        return "created succesfully post in javaspringboot";
    }
}
