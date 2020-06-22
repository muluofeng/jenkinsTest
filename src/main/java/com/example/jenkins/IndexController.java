package com.example.jenkins;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiexingxing
 * @Created by 2019-11-28 22:40.
 */
@RestController
@RequestMapping("/test")
public class IndexController {
    @RequestMapping("/index")
    public Object index(){
        List<Object> objects = new ArrayList<>();
        objects.add("a");
        objects.add("b");
        objects.add("ccc");
        objects.add("d");

        return objects;
    }
}