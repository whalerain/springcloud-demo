package com.github.whalerain.springbootkata.dao;

import com.github.whalerain.springbootkata.base.BaseTest;
import com.github.whalerain.springbootkata.model.User;
import com.github.whalerain.springbootkata.menum.UserStatus;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author ZhangXi
 */
class UserDaoTest extends BaseTest {

    @Resource
    private UserDao userDao;

//    @Test
    void testSelectById() {
        User user = userDao.selectById(1);
        assertNotNull(user, "user not null");
    }

//    @Test
    void testUpdateById() {
        User user = userDao.selectById(1);
        assertEquals(user.getRowVersion(), 0, "user row version = 0");
        user.setStatus(UserStatus.NORMAL);
        userDao.updateById(user);
        user = userDao.selectById(1);
        assertEquals(user.getRowVersion(), 1, "user row version = 1");
    }

//    @Test
    void testDeleteById_logic() {
        userDao.deleteById(1);
        User user = userDao.getOneById(1);
        assertTrue(user.getIsDeleted(), "user is deleted");
    }




}
