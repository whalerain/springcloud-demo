package com.github.whalerain.springbootkata.pojo.modelvo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.github.whalerain.springbootkata.model.User;
import com.github.whalerain.springbootkata.menum.Sex;
import com.github.whalerain.springbootkata.menum.UserStatus;
import com.github.whalerain.springbootkata.support.resource.ImageUrlSerializer;
import com.github.whalerain.springbootkata.validation.group.GUpd;
import io.swagger.v3.oas.annotations.media.Schema;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.*;
import java.io.Serializable;
import java.time.LocalDate;

/**
 * 用户VO超类
 * 该类会是其他{@link User}用户VO类的父类
 *
 * @author ZhangXi
 */
@Schema(name = "User", description = "用户数据")
public class UserVO extends User implements Serializable {

    @NotNull(groups = {GUpd.class})
    @Schema(description = "用户ID", example = "1", format = "null或者整数")
    @Override
    public Integer getId() {
        return super.getId();
    }

    @NotBlank
    @Schema(description = "登录名称", example = "tester", format = "必须为8~20位字母，数字组合")
    @Override
    public String getLoginName() {
        return super.getLoginName();
    }

    @Schema(description = "用户密码", example = "123456", format = "必须为8~20位字母，数字组合，字母包含大小写")
    @Override
    public String getPassword() {
        return super.getPassword();
    }

    @Schema(description = "用户昵称", example = "flyway", format = "长度在6~30之间，且不能包含特殊字符")
    @Override
    public String getNickName() {
        return super.getNickName();
    }

    @NotBlank
    @Size(min = 2, max = 5)
    @Schema(description = "真实姓名", example = "王元", format = "必须2~5位中文")
    @Override
    public String getRealName() {
        return super.getRealName();
    }

    @NotNull
    @Digits(integer = 3, fraction = 0)
    @Range(min = 1, max = 150)
    @Schema(description = "用户年龄", example = "26", format = "必须为1~150整数")
    @Override
    public Integer getAge() {
        return super.getAge();
    }

    @JsonFormat(pattern = "yyyy-MM-dd")
    @Override
    public LocalDate getBirthday() {
        return super.getBirthday();
    }


    @Schema(description = "用户性别", example = "man", requiredProperties = {"man", "woman"})
    @Override
    public Sex getSex() {
        return super.getSex();
    }

    @Override
    public String getMobile() {
        return super.getMobile();
    }

    @Override
    public String getEmail() {
        return super.getEmail();
    }

    @Override
    public UserStatus getStatus() {
        return super.getStatus();
    }

    /**
     * 自定义序列化，自动拼接图片url的前缀地址
     * @return
     */
    @JsonSerialize(using = ImageUrlSerializer.class)
    public String getAvatarUrl() {
        return "/data";
    }


    @JsonIgnore
    @Override
    public Boolean getIsDeleted() {
        return super.getIsDeleted();
    }

    @JsonIgnore
    @Override
    public Integer getRowVersion() {
        return super.getRowVersion();
    }

    @JsonIgnore
    @Override
    public void setIsDeleted(Boolean isDeleted) {
        super.setIsDeleted(isDeleted);
    }

    @JsonIgnore
    @Override
    public void setRowVersion(Integer rowVersion) {
        super.setRowVersion(rowVersion);
    }
}
