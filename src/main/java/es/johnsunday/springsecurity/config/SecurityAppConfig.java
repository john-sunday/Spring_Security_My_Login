package es.johnsunday.springsecurity.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
/**
 * With Spring Security version 5.7.1:
 * The type WebSecurityConfigurerAdapter is deprecated
 * 
 */
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;

@Configuration
@EnableWebSecurity
public class SecurityAppConfig extends WebSecurityConfigurerAdapter {

	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		UserBuilder users = User.withDefaultPasswordEncoder();
		// Cargamos usuarios en memoria.
		auth.inMemoryAuthentication()
		.withUser(users.username("juan").password("123").roles("administrador"))
		.withUser(users.username("maria").password("456").roles("usuario"))
		.withUser(users.username("manuela").password("789").roles("ayudante"))
		.withUser(users.username("antonio").password("321").roles("administrador"));		
	}
}
