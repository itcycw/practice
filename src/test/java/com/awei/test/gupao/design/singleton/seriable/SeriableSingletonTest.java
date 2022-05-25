package com.awei.test.gupao.design.singleton.seriable;

/**
 * @author Cw
 * @version 1.0.0
 * @Description
 * @createTime 2022年05月26日 01:07:00
 */
public class SeriableSingletonTest {

    public static void main(String[] args) {
        SeriableSingleton insistence = SeriableSingleton.getInsistence();
        System.out.println("insistence = " + insistence);
        //序列化
        //反序列化
        //todo 可以被序列化破坏单例

        //处理方法：在类里面桥接一个方法   private Object readResolve;

    }

}
