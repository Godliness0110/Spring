package com.hzw.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author Godliness
 * @date 2021/10/15 10:31
 * @Description
 */
public class ProxyTest {
    public static void main(String[] args) {
        //创建目标对象
        final Target target = new Target();
        //获得增强对象
        final Advice advice = new Advice();
        TargetInterface proxy = (TargetInterface) Proxy.newProxyInstance/*他的返回值就是动态生成的代理对象*/(
                target.getClass().getClassLoader(), //目标对象类加载器
                target.getClass().getInterfaces(), //目标对象相同的接口字节码对象数组
                new InvocationHandler() {
                    //调用代理对象的任何方法，实质执行的都是invoke方法
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        //前置增强
                        advice.before();
                        Object invoke = method.invoke(target, args);//执行目标方法
                        //后置增强
                        advice.afterReturning();
                        return invoke;
                    }
                }
        );
        //调用代理对象方法
        proxy.save();
    }
}
