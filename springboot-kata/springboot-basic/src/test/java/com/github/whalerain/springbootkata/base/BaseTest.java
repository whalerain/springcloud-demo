package com.github.whalerain.springbootkata.base;

import com.github.whalerain.springbootkata.SpringbootKataApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

/**
 * @author ZhangXi
 */
@SpringBootTest(classes = {SpringbootKataApplication.class})
@ActiveProfiles(value = "junit")
public class BaseTest {
}
