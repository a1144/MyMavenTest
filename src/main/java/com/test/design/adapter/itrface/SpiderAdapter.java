package com.test.design.adapter.itrface;

public class SpiderAdapter implements ISpider{

    @Override
    public void request() {
        System.out.println("发起请求");
    }

    @Override
    public void download() {

    }

    @Override
    public void analysis() {

    }

    @Override
    public void breakCheck() {

    }
}
