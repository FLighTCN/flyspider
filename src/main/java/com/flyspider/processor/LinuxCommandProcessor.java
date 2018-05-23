package com.flyspider.processor;

import com.alibaba.fastjson.JSONObject;
import com.flyspider.pojo.LinuxCommand;
import com.flyspider.service.LinuxCommandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.processor.PageProcessor;
import java.util.List;
@Component
public class LinuxCommandProcessor implements PageProcessor {
    private Site site = Site.me()
            .setRetryTimes(3)
            .setSleepTime(1000)
            .setDomain("commandlinefu.cn")
            .addHeader("Accept","*/*")
            .addHeader("Accept-Encoding","gzip, deflate")
            .addHeader("Accept-Language","zh-CN,zh;q=0.9,zh-TW;q=0.8")
            .addHeader("Referer","http://commandlinefu.cn/")
            .addHeader("X-Requested-With","XMLHttpRequest")
            .setUserAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/66.0.3359.181 Safari/537.36");
    @Autowired
    private LinuxCommandService linuxCommandService;


    @Override
    public void process(Page page) {
        String commandList=page.getRawText();
        List<LinuxCommand> clist=JSONObject.parseArray(commandList, LinuxCommand.class);
        for(LinuxCommand command:clist){
            linuxCommandService.insert(command);
        }
    }

    @Override
    public Site getSite() {
        return site;
    }
    public static void main(String[] args) {
        Spider.create(new LinuxCommandProcessor())
                .addUrl("http://commandlinefu.cn/api/Random?count=10")
                .thread(5).run();
    }
}
