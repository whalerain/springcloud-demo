package com.github.whalerain.springbootkata.junit5demo.repeated;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;

/**
 * @author ZhangXi
 */
public class RepeatedMethodTest {

    @BeforeEach
    void handleBeforeEach(RepetitionInfo repetitionInfo) {
        System.out.println("当前重复次数：" + repetitionInfo.getCurrentRepetition());
    }


    @DisplayName("尝试重复测试，")
    @RepeatedTest(value = 10)
    void repeatedTenTimes() {}


}
