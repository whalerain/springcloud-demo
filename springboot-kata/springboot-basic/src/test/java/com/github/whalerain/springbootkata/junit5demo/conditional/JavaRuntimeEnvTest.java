package com.github.whalerain.springbootkata.junit5demo.conditional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.JRE;

/**
 * @author ZhangXi
 */
class JavaRuntimeEnvTest {

    @Test
    @EnabledOnJre(JRE.JAVA_8)
    void testOnlyOnJava8() {}

    @Test
    @EnabledOnJre({JRE.JAVA_9, JRE.JAVA_10})
    void testOnJava9Or10() {}

    @Test
    @DisabledOnJre(JRE.JAVA_12)
    void testNotOnJava12() {}

}
