package com.github.whalerain.springbootkata.bean;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import java.io.IOException;

/**
 *
 *
 * @author ZhangXi
 */
@Slf4j
@Component
public class UrlFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        log.info("初始化filter: urlFilter ...");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        log.info("===== do url filter");
        filterChain.doFilter(servletRequest, servletResponse);
    }
}
