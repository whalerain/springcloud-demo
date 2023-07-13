package com.github.whalerain.springbootkata.junit5demo.disable;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * @author ZhangXi
 */
public class DisabledMethodTest {

    @Test
    @Disabled("disabled until bug #34 has been resolved")
    void testWillBeSkipped() {}

    @Test
    void testWillBeExecuted() {}

}
