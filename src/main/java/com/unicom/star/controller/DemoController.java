/*
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */

package com.unicom.star.controller;


import com.unicom.star.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 *
 */
@RestController
public class DemoController {


    @Autowired
    private TestService testService;

    @Value("${token}")
    private String token;

    @Value("${AppID}")
    private String clientId;

    @Value("${API_Key}")
    private String clientSecret;


    @RequestMapping(value = "/getback", method = {RequestMethod.POST, RequestMethod.GET})
    public String getBack(HttpServletRequest request, HttpServletResponse response) {
        String x = "123";
        x = x + testService.getAllProtiters();

        //authService.getAuth();
        System.out.println("=======clientSecret" + clientSecret);
        System.out.println("=======clientId" + clientId);
        System.out.println("=======token" + token);

        return x;

    }


}
