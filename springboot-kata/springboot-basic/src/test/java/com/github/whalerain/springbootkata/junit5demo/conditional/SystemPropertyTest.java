package com.github.whalerain.springbootkata.junit5demo.conditional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIfSystemProperty;
import org.junit.jupiter.api.condition.EnabledIfSystemProperty;

/**
 * @author ZhangXi
 */
class SystemPropertyTest {

    @Test
    @EnabledIfSystemProperty(named = "os.arch", matches = ".*64.*")
    void testOnlyOn64BitArch() {}

    @Test
    @DisabledIfSystemProperty(named = "ci-server", matches = "true")
    void testNotOnCiServer() {}

}
