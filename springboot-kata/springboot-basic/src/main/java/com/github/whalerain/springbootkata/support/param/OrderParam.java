package com.github.whalerain.springbootkata.support.param;

import lombok.Data;

/**
 * 排序参数
 *
 * @author ZhangXi
 */
@Data
public class OrderParam {

    private String name;

    /**
     * 只有两个固定值：ASC, DESC
     * ASC: 数据库升序排序
     * DESC: 数据库降序排序
     */
    private String sortType;

}
