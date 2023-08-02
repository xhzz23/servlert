package com.iweb.util;


import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @Author 小火煮粥
 * @date 2023/8/1 22:39
 * @WeChat xhzz211423
 */


public class DruidUtil {
    private static DataSource dataSource;
    static {
        InputStream inputStream =
                DruidUtil.class.getClassLoader().
                        getResourceAsStream("db.properties");
        Properties p = new Properties();
        try {
            p.load(inputStream);
            dataSource =
                    DruidDataSourceFactory.createDataSource(p);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static DataSource getDataSource(){
        return dataSource;
    }

}
