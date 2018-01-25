package org.pcchen.common;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.web.servlet.ErrorPage;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * Tomcat相关配置以及错误url定位error.html
 *
 * @author cpc
 * @create 2018-01-25 9:54
 **/
@Component
public class CustomServletContainer implements EmbeddedServletContainerCustomizer {
    @Value("${server.port}")
    private Integer port;
    @Value("${redirect.error.url.page}")
    private String errorUrlPage;

    @Override
    public void customize(ConfigurableEmbeddedServletContainer container) {
        System.err.println(port);
        System.err.println(errorUrlPage);
        container.setPort(port);
        container.addErrorPages(new ErrorPage(HttpStatus.NOT_FOUND, errorUrlPage));
        container.setSessionTimeout(30, TimeUnit.MINUTES);
    }
}
