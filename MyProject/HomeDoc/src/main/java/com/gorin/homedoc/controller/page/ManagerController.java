package com.gorin.homedoc.controller.page;

import org.apache.catalina.Manager;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class ManagerController {

    @GetMapping("/manager/{id}")
    public void getManagerById(@PathVariable("id") String id) {
    }
    @GetMapping ("/managers")
    public Manager getAllManagers(){
        return null;
    }
}
