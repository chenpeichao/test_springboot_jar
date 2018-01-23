package org.pcchen.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户controller
 * Created by ceek on 2018-01-23 22:00.
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @GetMapping("/find")
    public String find() {
        return "wojiushiwo";
    }
}
