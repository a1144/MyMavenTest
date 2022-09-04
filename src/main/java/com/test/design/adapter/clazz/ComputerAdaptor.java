package com.test.design.adapter.clazz;

public class ComputerAdaptor extends ComputerAdaptee implements IInterfaceTarget{

    public void music() {
        System.out.println("使用音响播放音乐");
    }

    @Override
    public void mouse() {
        System.out.println("鼠标移动");
    }
}
