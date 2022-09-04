package com.test.design.adapter.clazz;


/**
 * 类适配器基于继承
 */
public class Demo {
    public static void main(String[] args) {
        IInterfaceTarget interfaceTarget = new ComputerAdaptor();
        interfaceTarget.display();
        interfaceTarget.music();
        //interfaceTarget.mouse();
    }
}
