package com.test.design.adapter.itrface;

/**
 * 接口适配器模式也即缺省适配器模式，提供缺省实现
 */
public class Demo {
    public static void main(String[] args) {
        BaiduSpider baiduSpider = new BaiduSpider();
        SogouSpider sogouSpider = new SogouSpider();
        baiduSpider.request();
        baiduSpider.download();

        sogouSpider.request();
        sogouSpider.breakCheck();
        sogouSpider.analysis();
        sogouSpider.persistence();


    }
}
