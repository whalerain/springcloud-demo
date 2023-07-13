package com.github.whalerain.springbootkata.junit5demo.conditional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

/**
 * Junit5 DEMO
 *
 * @author ZhangXi
 */
class OperationSystemTest {

    @Test
    @EnabledOnOs(OS.WINDOWS)
    void testOnMacOs() {}

    @TestOnMac
    void testOnMac() {}

    @Test
    @EnabledOnOs({OS.LINUX, OS.MAC})
    void testOnLinuxOrMac() {}

    @Test
    @DisabledOnOs(OS.MAC)
    void testNotOnWindows() {}

}
