package com.simple.simplecore.controller;

import com.simple.simplecore.domain.Response;
import org.springframework.web.bind.annotation.*;

/*
 * @Author     :
 * @Data       : 2022/6/24 20:40
 * @Description:
 */
@RestController
@RequestMapping(value = "/simple/core/test")
public class CoreController {

    @RequestMapping(value = "/sayHello", method = RequestMethod.GET)
    public Response sayHello(@RequestParam String name) {
        return Response.successful("Hello " + name);
    }
}
