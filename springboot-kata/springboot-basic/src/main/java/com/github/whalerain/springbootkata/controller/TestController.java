package com.github.whalerain.springbootkata.controller;

import com.github.whalerain.springbootkata.pojo.modelvo.JsonData;
import com.github.whalerain.springbootkata.pojo.modelvo.UserVO;
import com.github.whalerain.springbootkata.support.base.BaseResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

/**
 * 测试接口
 *
 * @author ZhangXi
 */
@Slf4j
@RestController
@RequestMapping(value = "/test")
public class TestController extends BaseController {

    @PostMapping(value = "/bodyTypeConverter")
    public BaseResponse<JsonData> testBodyTypeConverter(@RequestBody JsonData data) {
        BaseResponse<JsonData> response = new BaseResponse<>();
        response.setData(data);
        return response;
    }


    @GetMapping(path = "/urlPrefix")
    public BaseResponse<UserVO> testResourcePrefix() {
        BaseResponse<UserVO> response = new BaseResponse<>();
        UserVO data = new UserVO();
        response.success("获取已有前缀", data);
        return response;
    }



}
