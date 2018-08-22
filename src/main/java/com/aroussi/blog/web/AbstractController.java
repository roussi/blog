package com.aroussi.blog.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = AbstractController.API_VERSION)
public class AbstractController {

    public static final String API_VERSION= "/api/v1";

}
