package cn.codeyang.security.conf;

import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.oauth2.client.OAuth2ClientContext;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.security.oauth2.client.resource.OAuth2ProtectedResourceDetails;

/**
 * Created by yangzhongyang on 17/11/10
 */
@Configuration
@EnableWebSecurity
@EnableOAuth2Sso
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
    /**
     * 从1.4.0以后需要手动创建
     * https://github.com/spring-projects/spring-boot/commit/00f9adafd7bcd23191251ebf6ca50f69ef166077
     *
     * @param oauth2ClientContext client context
     * @param details             client details
     * @return oauth2RestTemplate bean
     */
    @Bean
    public OAuth2RestTemplate oauth2RestTemplate(OAuth2ClientContext oauth2ClientContext,
                                                 OAuth2ProtectedResourceDetails details) {
        return new OAuth2RestTemplate(details, oauth2ClientContext);
    }

    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring()
                .antMatchers("/webjars/**");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // @formatter:off
        http
                .authorizeRequests()
                .anyRequest().authenticated()
                .and()
                // 下面是基于Http头的csrf保护，这部分是可选配置
                //.csrf()
                //    .csrfTokenRepository(csrfTokenRepository()).and()
                //    .addFilterAfter(csrfHeaderFilter(), CsrfFilter.class)
                .csrf().disable()
                // 可选配置结束
//            .logout().logoutUrl("/logout").permitAll()
//                .logoutSuccessUrl("/")
//                .and()
                .formLogin()
                .disable()
                .httpBasic()
                .disable()
        ;
        // @formatter:on
    }
}
