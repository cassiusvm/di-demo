package br.eti.cvm.didemo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

import br.eti.cvm.didemo.examplebeans.FakeDataSource;
import br.eti.cvm.didemo.examplebeans.FakeJmsBroker;

@Configuration
// Spring 5
//@PropertySource("classpath:datasource.properties")
// Spring 4
@PropertySources({ @PropertySource("classpath:datasource.properties"), @PropertySource("classpath:jms.properties") })
public class PropertyConfig {
	@Autowired
	Environment env;

	@Value("${guru.username}")
	String username;

	@Value("${guru.password}")
	String password;

	@Value("${guru.dburl}")
	String dburl;
	
	@Value("${guru.jms.username}")
    String jmsUsername;

    @Value("${guru.jms.password}")
    String jmsPassoword;

    @Value("${guru.jms.url}")
    String jmsUrl;

	@Bean
	public FakeDataSource fakeDataSource() {
		FakeDataSource fakeDataSource = new FakeDataSource();
//		fakeDataSource.setUsername(username);
		fakeDataSource.setUsername(env.getProperty("USERNAME"));
		fakeDataSource.setPassword(password);
		fakeDataSource.setDburl(dburl);
		return fakeDataSource;
	}

	@Bean
	public FakeJmsBroker fakeJmsBroker() {
		FakeJmsBroker jmsBroker = new FakeJmsBroker();
		jmsBroker.setUsername(jmsUsername);
		jmsBroker.setPassword(jmsPassoword);
		jmsBroker.setUrl(jmsUrl);
		return jmsBroker;
	}

	@Bean
	public static PropertySourcesPlaceholderConfigurer properties() {
		PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
		return propertySourcesPlaceholderConfigurer;
	}
}
