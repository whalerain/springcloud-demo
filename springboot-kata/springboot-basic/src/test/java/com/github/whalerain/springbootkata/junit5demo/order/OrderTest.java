package com.github.whalerain.springbootkata.junit5demo.order;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

/**
 * @author ZhangXi
 */
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class OrderTest {

    @Test
    @Order(1)
    void testNullValues() {}

    @Test
    @Order(2)
    void testEmptyValues() {}

    @Test
    @Order(3)
    void testBlankValues() {}

}
