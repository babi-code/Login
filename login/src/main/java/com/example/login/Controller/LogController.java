package com.example.login.Controller;

import com.example.login.Model.Log;
import com.example.login.Service.LogService;
import com.example.login.Validation.LogValidation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/login")
public class LogController {

    @Autowired
    public LogService service;

    @GetMapping("/existingUser")
    public List<Log> getCredential(){ return service.getCredential();
    }

    @PostMapping("/newUser")
    public void user(@RequestBody Log log){

         service.user(log);
    }

    @GetMapping("/{userName}")
    public  Log getByUserName(@PathVariable String userName){
        return service.getByUserName(userName);
    }

}
