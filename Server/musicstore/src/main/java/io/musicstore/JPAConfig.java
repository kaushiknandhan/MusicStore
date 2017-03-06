package io.musicstore;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@PropertySource(value="classpath:application.properties")
public class JPAConfig {
//	@Bean
//	public LocalContainerEntityManagerFactoryBean EntityManagerFactoryBean(){
//		LocalContainerEntityManagerFactoryBean emf = new LocalContainerEntityManagerFactoryBean();
//		emf.setDataSource(dataSource());
//		return null;
//	}
//	@Bean
//	public DataSource dataSource() {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
