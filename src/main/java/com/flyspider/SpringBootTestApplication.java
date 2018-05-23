package com.flyspider;

import com.flyspider.processor.LinuxCommandProcessor;
import com.flyspider.service.LinuxCommandService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import us.codecraft.webmagic.Spider;

@SpringBootApplication
@MapperScan("com.*.dao")
public class SpringBootTestApplication {
	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(SpringBootTestApplication.class, args);
        Spider.create((LinuxCommandProcessor)ctx.getBean("linuxCommandProcessor"))
                .addUrl("http://commandlinefu.cn/api/Random?count=10")
                .thread(5).run();
    }
}
