package com.test.other;
/** 类加载示例 */
public class TestClassLoader {
    public static void main(String[] args) {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        System.out.println(classLoader);

        ClassLoader parentClassLoader = classLoader;
        while (true) {
            parentClassLoader = parentClassLoader.getParent();
            System.out.println(parentClassLoader);
            if(parentClassLoader == null) {
                break;
            }

        }

    }
}
