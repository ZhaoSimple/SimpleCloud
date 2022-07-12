package com.simple.simplecore.controller;

import com.simple.simplecore.domain.Response;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

/*
 * @Author     :
 * @Data       : 2022/6/24 20:40
 * @Description:
 */
@RestController
@RequestMapping(value = "/simple/core/test")
public class CoreController {
//    private static final Logger LOGGER = LogManager.getLogger(CoreController.class);

    private static final Logger LOGGER = LoggerFactory.getLogger(CoreController.class);

    @RequestMapping(value = "/sayHello", method = RequestMethod.GET)
    public Response sayHello(@RequestParam String name) {
        LOGGER.info("one request of: {}", name);
        return Response.successful("Hello " + name);
    }
}
