package br.eti.cvm.didemo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.eti.cvm.didemo.examplebeans.FakeDataSource;
import br.eti.cvm.didemo.examplebeans.FakeJmsBroker;

@Configuration
public class PropertyConfig {
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
		fakeDataSource.setUsername(username);
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
}
