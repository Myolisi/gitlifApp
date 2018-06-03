package com.myolisi.gitlib;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.ResultSet;
import com.datastax.driver.core.Row;
import com.datastax.driver.core.Session;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan
public class appConfig {
    public static void main(String[] args) {
        SpringApplication.run(appConfig.class, args);

        Cluster cluster = Cluster.builder().addContactPoint("127.0.0.1").build();
        Session session = cluster.connect("killr_video");
        ResultSet results = session.execute("SELECT * FROM videos");

        for (Row row : results) {
            System.out.println(row.getString("title"));
        }
    }
}
