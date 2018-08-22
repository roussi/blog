package com.aroussi.blog.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArticleController extends AbstractController{

    @GetMapping(value = "/articles")
    public String allArticles(){
        return "All articles";
    }

}
