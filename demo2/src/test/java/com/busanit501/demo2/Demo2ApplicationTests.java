package com.busanit501.demo2;

import lombok.Data;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;

@SpringBootTest
@Log4j2
@Data
class Demo2ApplicationTests {

    @Test
    void contextLoads() {

    }

    @Autowired
    private DataSource dataSource;

}
