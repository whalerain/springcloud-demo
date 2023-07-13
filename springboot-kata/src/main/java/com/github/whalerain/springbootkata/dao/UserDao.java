package com.github.whalerain.springbootkata.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.github.whalerain.springbootkata.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * 用户数据DAO层接口
 *
 * @author ZhangXi
 */
@Mapper
public interface UserDao extends BaseMapper<User> {

    /**
     * 根据ID获取用户
     * 排除逻辑删除
     * @param userId 用户ID
     * @return {@link User}
     */
    @Select("select * from user where id = #{id}")
    User getOneById(@Param("id") Integer userId);

}
