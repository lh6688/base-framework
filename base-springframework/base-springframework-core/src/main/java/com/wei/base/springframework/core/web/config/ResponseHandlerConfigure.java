package com.wei.base.springframework.core.web.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@ConfigurationProperties(prefix = "spring.response-body-advice")
@Configuration
public class ResponseHandlerConfigure {

    /**
     * 是否启用返回值封装 默认为true
     */
    private Boolean enabled = Boolean.TRUE;

    /**
     * null值是否返回,默认为不返回
     */
    private Boolean isWriteMapNullValue = Boolean.FALSE;

    /**
     * 返回值时间格式
     */
    private String dateFormat = "yyyy-MM-dd HH:mm:ss";
}