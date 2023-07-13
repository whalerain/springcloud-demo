package com.github.whalerain.springbootkata.controller;

import com.github.whalerain.springbootkata.support.base.BaseResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * 图片等多媒体资源控制器
 *
 * @author ZhangXi
 */
@RequestMapping(path = "/upload")
@RestController
public class UploadController {


    //todo 上传图片
    //todo 下载图片，直接提供字节流方式
    //todo 下载图片


    @RequestMapping(path = "/image")
    public BaseResponse<String> uploadImage(@RequestParam("file")MultipartFile file) {
        BaseResponse<String> response = new BaseResponse<>();
        return response;
    }

    @RequestMapping(path = "/file")
    public BaseResponse<String> uploadFile(@RequestPart("file")MultipartFile file) {
        BaseResponse<String> response = new BaseResponse<>();
        return response;
    }













}
