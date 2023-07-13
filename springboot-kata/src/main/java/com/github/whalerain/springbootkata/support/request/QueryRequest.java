package com.github.whalerain.springbootkata.support.request;

import com.github.whalerain.springbootkata.support.base.BaseRequest;
import com.github.whalerain.springbootkata.support.param.OrderParam;
import com.github.whalerain.springbootkata.support.param.PagedParams;
import com.github.whalerain.springbootkata.support.param.QueryParams;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.Valid;
import java.util.List;

/**
 * API查询请求数据VO
 *
 * @author ZhangXi
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class QueryRequest<K extends QueryParams> extends BaseRequest {

    /**
     * 查询参数
     */
    @Schema(description = "查询参数")
    private K queryParams;

    /**
     * 分页参数
     */
    @Valid
    @Schema(description = "分页参数", required = true)
    private PagedParams pagedParams;

    /**
     * 排序参数
     */
    @Schema(description = "排序参数")
    private List<OrderParam> orderParams;

}
