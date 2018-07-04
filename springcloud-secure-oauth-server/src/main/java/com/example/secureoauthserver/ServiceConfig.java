package com.example.secureoauthserver;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configuration.GlobalAuthenticationConfigurerAdapter;

@Configuration
public class ServiceConfig extends GlobalAuthenticationConfigurerAdapter {

	@Override
	public void init(AuthenticationManagerBuilder auth) throws Exception {	
		auth.inMemoryAuthentication()
		.withUser("mehdi").password("{noop}pass1").roles("USER").and()
		.withUser("tom").password("{noop}pass2").roles("USER", "OPERATOR");
	}
}
