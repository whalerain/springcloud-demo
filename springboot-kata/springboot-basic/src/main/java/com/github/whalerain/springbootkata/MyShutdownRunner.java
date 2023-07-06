package com.github.whalerain.springbootkata;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.stereotype.Component;

/**
 * Java停机处理线程
 *
 * spring提供了一个 {@link DisposableBean} 接口用来在spring销毁bean对象时执行一些自定义处理
 * @author ZhangXi
 */
public class MyShutdownRunner extends Thread {

    @Override
    public void run() {
        super.run();
    }
}
