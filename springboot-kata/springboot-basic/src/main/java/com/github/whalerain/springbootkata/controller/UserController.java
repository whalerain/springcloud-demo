package com.github.whalerain.springbootkata.controller;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.github.whalerain.springbootkata.exception.InvalidParamException;
import com.github.whalerain.springbootkata.model.User;
import com.github.whalerain.springbootkata.pojo.modelvo.UserVO;
import com.github.whalerain.springbootkata.support.request.AbstractModelRequest;
import com.github.whalerain.springbootkata.support.base.BaseResponse;
import com.github.whalerain.springbootkata.tool.JsonTools;
import io.swagger.v3.oas.annotations.Hidden;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @author ZhangXi
 */
@Tag(name = "/user", description = "用户接口")
@Slf4j
@RestController
@RequestMapping(value = "/user")
public class UserController extends BaseController {


    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public BaseResponse testFilterAndListener() {
        return new BaseResponse();
    }



    @Operation(
            summary = "新增用户，很惆怅", description = "详细说明下是如何新增用户的哈哈"

    )
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public BaseResponse<UserAdd> addUser(@RequestBody @Validated UserAddRequest userAddRequest) {
        log.info("打印结果：{}", JsonTools.toJsonStr(userAddRequest));
        BaseResponse response = new BaseResponse();
        response.success("success", userAddRequest.getData());
        return response;
    }

    @Schema(name = "新增", title = "新增用户")
    @EqualsAndHashCode(callSuper = true)
    @Data
    private static class UserAddRequest extends AbstractModelRequest<User> {

        @Valid
        @JsonIgnoreProperties(value = {"id", "password"})
        private UserAdd data;

        @Override
        protected void checkAndHandleData() throws InvalidParamException {
            //fixme 检查用户数据是否非法
        }

        @Override
        protected User buildModel() {
            return data;
        }
    }

    @JsonIgnoreProperties(value = {"id", "password"})
    private static class UserAdd extends UserVO {
        @Hidden
        @Override
        public Integer getId() {
            return super.getId();
        }
        @Hidden
        @Override
        public String getPassword() {
            return super.getPassword();
        }
    }


}
