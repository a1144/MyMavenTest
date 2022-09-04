package com.test.design.adapter.itrface;

public class SogouSpider extends SpiderAdapter{
    public void breakCheck(){
        System.out.println("破解搜狗反爬");
    }
    public void analysis(){
        System.out.println("解析搜狗数据");
    }
    public void persistence(){
        System.out.println("搜狗数据保存到mysql");
    }
}
