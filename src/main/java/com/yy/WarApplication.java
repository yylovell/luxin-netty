package com.yy;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * Copyright © 2018 Shanghai Yejia Diaital Technology Co.,Ltd. All rights reserved.
 * 使用外置Tomcat启动application
 *
 * @author yy
 * @datetime 2021/1/25 11:33
 */
public class WarApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(Application.class);
    }
}
