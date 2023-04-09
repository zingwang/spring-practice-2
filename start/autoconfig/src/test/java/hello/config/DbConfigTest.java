package hello.config;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.TransactionManager;

import javax.sql.DataSource;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
@SpringBootTest
public class DbConfigTest {
    @Autowired
    DataSource dataSource;

    @Autowired
    TransactionManager transactionManager;

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Test
    void checkBean(){
        log.info("dataSource = {}", dataSource);

        log.info("transactionManager = {}", transactionManager);

        log.info("jdbcTemplate = {}", jdbcTemplate);


        /*
        DbConfig 에 주석해도 통과
        스프링 부트가 자동으로 등록해주는 빈이기 때문
        */

        assertThat(dataSource).isNotNull();
        assertThat(transactionManager).isNotNull();
        assertThat(jdbcTemplate).isNotNull();


    }
}
