package com.flyspider.processor;

import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.pipeline.JsonFilePipeline;
import us.codecraft.webmagic.processor.PageProcessor;

public class StatNbaProcessor implements PageProcessor {
    private Site site = Site.me().setRetryTimes(3).setSleepTime(1000);

    @Override
    public void process(Page page) {
       /* page.putField("author",page.getUrl().regex("http://commandlinefu.cn/api/Random?count=10").toString());*/
        /*page.putField("name",page.getHtml().*//*$("title").*//*toString());*/
        page.putField("body",page.getRawText().replaceAll("\\\\",""));
        System.out.println(page.getResultItems().get("body").toString());
        /*if (page.getResultItems().get("name")==null){
            page.setSkip(true);
        }*/
        /*page.putField("detail",page.getHtml().xpath("//div[@class='detail']").toString());*/
    }

    @Override
    public Site getSite() {
        return site;
    }

    public static void main(String[] args) {
        Spider nbaSpider=Spider.create(new StatNbaProcessor());
        nbaSpider.addPipeline(new JsonFilePipeline("D:\\webmagicLinux\\"))
                .thread(5).run();
    }
}
