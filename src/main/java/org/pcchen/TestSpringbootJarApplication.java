package org.pcchen;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class TestSpringbootJarApplication {

	public static void main(String[] args) {
//		SpringApplication.run(TestSpringbootJarApplication.class, args);

//        //此种方式可以使控制台不用显示springboot这几个字
//		SpringApplicationBuilder builder = new SpringApplicationBuilder(TestSpringbootJarApplication.class);
//		//修改Banner的模式为OFF
//		builder.bannerMode(Banner.Mode.OFF).run(args);
		SpringApplication springApplication = new SpringApplication(TestSpringbootJarApplication.class);
		springApplication.run(args);
	}
}
