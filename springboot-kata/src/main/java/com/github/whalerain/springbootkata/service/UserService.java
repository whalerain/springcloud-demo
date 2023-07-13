package com.github.whalerain.springbootkata.service;

import com.github.whalerain.springbootkata.model.User;
import com.github.whalerain.springbootkata.pojo.modelvo.UserVO;
import com.github.whalerain.springbootkata.support.PagedData;
import com.github.whalerain.springbootkata.support.param.PagedParams;
import com.github.whalerain.springbootkata.support.param.QueryParams;

/**
 * 用户Service层接口
 *
 * @author ZhangXi
 */
public interface UserService {

    /**
     * 根据ID获取可用用户
     * @param id 用户ID
     * @return {@link UserVO}
     */
    UserVO getAvailableUser(int id);

    /**
     * 用户分页查询
     * @param pagedParams {@link PagedParams}
     * @param queryParams {@link QueryParams}
     * @return {@link PagedData<UserVO>}
     */
    PagedData<UserVO> queryPagedUsers(PagedParams pagedParams, QueryParams queryParams);

    /**
     * 新增用户
     * @param user {@link User}
     * @return {@link UserVO}
     */
    UserVO addUser(User user);

    /**
     * 更新用户
     * @param user {@link User}
     * @return {@link UserVO}
     */
    UserVO updateUser(User user);

    /**
     * 删除用户
     * @param id 用户ID
     */
    void deleteUser(int id);

    /**
     * 启用用户
     * @param id 用户ID
     */
    void enableUser(int id);

    /**
     * 禁用用户
     * @param id 用户ID
     */
    void disableUser(int id);

}
