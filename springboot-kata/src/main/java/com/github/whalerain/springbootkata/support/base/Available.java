package com.github.whalerain.springbootkata.support.base;

/**
 * 取值接口，用来统一提取某个值对象
 *
 * @author ZhangXi
 */
public interface Available<T> {

    /**
     * 获取值
     * @return T 泛型对象
     */
    T take();

}
