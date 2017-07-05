package com.swellwu.dubbo;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by wuxinjian on 2017/7/5.
 */
@Configuration
@PropertySource(value = "classpath:dubbo/dubbo.properties")
@ImportResource({"classpath:dubbo/*.xml"})
public class DubboConfig {
}
