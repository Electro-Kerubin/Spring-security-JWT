package com.nerfilin.demojwt.Controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class ApiController {

    @RequestMapping(value = "home", method = RequestMethod.POST)
    public String Welcome() {
        return "Home";
    }
}
