package com.hero.project.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hero.project.client.impl.SupermanService;

/**
 * demo
 *
 * @author hezun
 */

@RestController
@RequestMapping("/superman")
public class ExampleController {

    @Autowired
    private SupermanService supermanService;

    @GetMapping("/")
    public String get() {
        return supermanService.create();
    }
}
