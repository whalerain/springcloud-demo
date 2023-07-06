package com.github.whalerain.springbootkata.junit5demo.disable;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * @author ZhangXi
 */
@Disabled("disabled until bug #99 has been fixed")
public class DisabledClassTest {

    @Test
    void testWillBeSkipped() {}

}
