package org.pcchen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;

@EnableAutoConfiguration
@SpringBootApplication
//为了避免中文乱码-此处最好设置字符串的字符集
//此注解用于获取指定文件下面的常量值
@ConfigurationProperties(prefix = "book")
@PropertySource(value = {"classpath:config/constant/constant.properties"},encoding="utf-8")
public class TestSpringbootJarApplication {

	public static void main(String[] args) {
//		SpringApplication.run(TestSpringbootJarApplication.class, args);

//        //此种方式可以使控制台不用显示springboot这几个字
//		SpringApplicationBuilder builder = new SpringApplicationBuilder(TestSpringbootJarApplication.class);
//		//修改Banner的模式为OFF
//		builder.bannerMode(Banner.Mode.OFF).run(args);

		SpringApplication springApplication = new SpringApplication(TestSpringbootJarApplication.class);
		//设置取消控制台对于springboot大字的打印
		//springApplication.setBannerMode(Banner.Mode.OFF);
		springApplication.run(args);
	}
}
