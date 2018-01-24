package org.pcchen.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户controller
 * Created by ceek on 2018-01-23 22:00.
 */
@RestController
@RequestMapping("/test")
//为了避免中文乱码-此处最好设置字符串的字符集
//此注解用于获取指定文件下面的常量值
@PropertySource(value = {"classpath:config/common.properties"},encoding="utf-8")
public class TestController {

    @Value("${common.name}")
    private String commonName;

    /**
     * 验证通过配置文件读取常量-通过@Value注解注入常量
     * @return  返回从指定文件读取的常量值
     */
    @GetMapping("/getCommonValue")
    public String find() {
        return commonName;
    }

}
