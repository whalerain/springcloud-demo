package com.github.whalerain.springbootkata.tool;

import org.springframework.beans.BeanUtils;

/**
 * @author ZhangXi
 */
public final class PojoTools {

    /**
     * 将持久化数据拷贝到VO对象
     * @param model 实体对象
     * @param vo VO对象
     */
    public static void copyModelToVo(Object model, Object vo) {
        if(null == model || vo == null) {
            return;
        }
        BeanUtils.copyProperties(model, vo);
    }




}
