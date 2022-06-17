package es.johnsunday.springsecurity.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
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
		.withUser(users.username("juan").password("123").roles("user","admin"))
		.withUser(users.username("maria").password("456").roles("user"))
		.withUser(users.username("manuela").password("789").roles("user","assistant"))
		.withUser(users.username("antonio").password("321").roles("user","admin"));		
	}

	// Method to configure our web security(login,logout,etc).
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
		/*
		 * .authorizeRequests() .anyRequest() .authenticated() .and() .formLogin()
		 */
		.authorizeRequests()
		.antMatchers("/")
		.hasRole("user")
		.antMatchers("/administrators/**")
		.hasRole("admin")
		.and()
		.formLogin()
		// Login page.
		.loginPage("/myLoginForm")
		// Login Url.
		.loginProcessingUrl("/userAuthentication")
		.permitAll()
		// Vídeo 98. Logout
		.and()
		.logout()
		.permitAll();
	}
	
}
