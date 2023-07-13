package com.github.whalerain.springbootkata.support.param;

import lombok.Data;

/**
 * 分页参数
 *
 * @author ZhangXi
 */
@Data
public class PagedParams {

    private Integer pageNum;

    private Integer pageSize;

}
