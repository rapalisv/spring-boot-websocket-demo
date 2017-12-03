package com.lito.websocket.demo.test;

import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import com.lito.websocket.demo.test.config.RepositoryTestConfiguration;

/**
 * Repository abstract test class
 * 
 * @author rapalisv
 *
 */
@RunWith(SpringRunner.class)
@DataJpaTest(showSql = false)
@ComponentScan(basePackageClasses= {RepositoryTestConfiguration.class})
@ActiveProfiles("repository-test")
public abstract class AbstractRepositotyTest {

}
