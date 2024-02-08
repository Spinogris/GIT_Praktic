package com.gorin.homedoc.controller.page;

import com.gorin.homedoc.entity.Account;
import com.gorin.homedoc.service.interf.TestSercvice;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //todo
@RequiredArgsConstructor
@RequestMapping("/test")
public class TestController {
    private final TestSercvice testSercvice;

    @GetMapping("/acc/{id}")
    public Account getAccountById(@PathVariable("id") String id) {
        return testSercvice.getAccById(id);
    }


}
