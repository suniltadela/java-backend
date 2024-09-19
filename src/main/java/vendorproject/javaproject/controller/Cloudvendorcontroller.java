package vendorproject.javaproject.controller;

import org.springframework.web.bind.annotation.*;
import vendorproject.javaproject.Service.CloudvendorService;
import vendorproject.javaproject.model.Cloudvendor;

@RestController
@RequestMapping("/vendorpath")
public class Cloudvendorcontroller {
    CloudvendorService cloudvendorService;
    public Cloudvendorcontroller(CloudvendorService cloudvendorService) {
        this.cloudvendorService = cloudvendorService;
    }
    @GetMapping("{vendorid}")
    public Cloudvendor getdetails(@PathVariable("vendorid") String vendorid){

        return cloudvendorService.getvendordetail(vendorid);
    }
    @GetMapping("/hello")
    public String hello(){
        return "hellospringboot";
    }
    @PostMapping
    public String postdetails(@RequestBody Cloudvendor cloudvendor){
        cloudvendorService.createvendordetails(cloudvendor);
        return "created succesfully post in javaspringboot";
    }
    @DeleteMapping("{vendorid}")
    public String Deletedetails(@PathVariable("vendorid")String vendorid){
        cloudvendorService.deletevendordetails(vendorid);
        return "delsuccesfully";
    }
}
