package org.pcchen.web;

import lombok.extern.log4j.Log4j;
import org.pcchen.bean.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
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
@Log4j
public class TestController {

    @Value("${common.name}")
    private String commonName;

    @Autowired
    private Book book;

    /**
     * 验证通过配置文件读取常量-通过@Value注解注入常量
     * @return  返回从指定文件读取的常量值
     */
    @GetMapping("/getCommonValue")
    public String find() {
        System.out.println(book.getName());
        log.debug("debug=======lombok output log哈");
        log.info("info=======lombok output log哈");
        log.warn("warn=======lombok output log哈");
        log.error("error=======lombok output log哈");
        return commonName;
    }
}
