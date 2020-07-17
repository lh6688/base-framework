package com.wei.base.springframework.mysql.constants;

import lombok.Data;

@Data
public class GeneratorParam {

    /**
     * 生成文件时文件创建人
     */
    private String author = "wei";

    /**
     * 生成文件路径
     */
    private String outputDir = "/wei/test/src/main/java/";

    /**
     * 驱动连接的URL
     */
    private String dataSourceUrl = "jdbc:mysql://gz-cdb-mrzurxn3.sql.tencentcdb.com:60057/share?autoReconnect=true&useUnicode=true&characterEncoding=utf8&zeroDateTimeBehavior=CONVERT_TO_NULL&useSSL=false&serverTimezone=CTT";

    /**
     * 数据库连接用户名
     */
    private String dataSourceUserName = "root";

    /**
     * 数据库连接密码
     */
    private String dataSourcePassWord = "Leven1234@";

    /**
     * 需要生成的表
     */
    private String[] include = {};

    /**
     * 排除生成的表
     */
    private String[] exclude = {};

    /**
     * 包名
     */
    private String parent = "com.wei.test";
}
