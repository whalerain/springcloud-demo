package com.github.whalerain.springbootkata.junit5demo.conditional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;

/**
 * @author ZhangXi
 */
class EnvVariableTest {


    @Test
    @EnabledIfEnvironmentVariable(named = "ENV", matches = "staging-server")
    void testOnlyOnStagingServer() {}

    @Test
    @DisabledIfEnvironmentVariable(named = "ENV", matches = ".*prod.*")
    void testNotOnProdServer() {}

}
