package com.wsp;

import com.wsp.config.ConfigBean;
import com.wsp.config.MyTestConfigBean;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * spring boot以 外置servlet容器的方式启动
 *
 */
@EnableConfigurationProperties({MyTestConfigBean.class,ConfigBean.class})
@SpringBootApplication
public class WebApplication extends SpringBootServletInitializer {


    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        builder.sources(this.getClass());
        return super.configure(builder);
    }


}
