package com.github.whalerain.springbootkata.support.request;

import com.github.whalerain.springbootkata.exception.InvalidParamException;
import com.github.whalerain.springbootkata.support.base.BaseRequest;

/**
 * 抽象实体数据请求VO
 *
 * @author ZhangXi
 */
public abstract class AbstractModelRequest<T> extends BaseRequest {

    /**
     * 校验请求参数，并处理数据后，获取实体类
     *
     * @return T
     */
    public T obtainCheckedModel() throws InvalidParamException {
        //日志记录等
        checkAndHandleData();
        return buildModel();
    }

    /**
     * 检查并处理传入的表单数据
     */
    protected abstract void checkAndHandleData() throws InvalidParamException;

    /**
     * 创建Model对象
     * @return T
     */
    protected abstract T buildModel();

}
