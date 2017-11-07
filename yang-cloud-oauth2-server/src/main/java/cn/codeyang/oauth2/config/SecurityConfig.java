package cn.codeyang.oauth2.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

/**
 * Created by yangzhongyang on 17/11/7
 */
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests().antMatchers("/css/**", "/js/**", "/fonts/**", "/index").permitAll()    //谁都可以访问
                .antMatchers("/users/**").hasRole("USER")   //必须有USER权限
                .antMatchers("/admins/**").hasRole("ADMIN")  //必须有ADMIN权限
                .and()
                .formLogin()    //基于form表单登陆
                .loginPage("/login").failureUrl("/login-error")
                .and().logout().logoutSuccessUrl("/")
                .and()
                .exceptionHandling().accessDeniedPage("/403");

        //http.logout()
        //        .logoutUrl("/my/logout")    //自定义触发登出行为的url
        //        .logoutSuccessUrl("/my/index")  //指定登陆成功后跳转的url
        //        .logoutSuccessHandler(logoutSuccessHandler)     //指定一个LogoutSuccessHandler
        //        .invalidateHttpSession(true)    //指定注销是是否是HttpSession无效, 默认为true
        //        .addLogoutHandler(logoutHandler)    //添加LogoutHandler, 默认情况下SecurityContextLogoutHandler作为最后一个LogoutHandler被添加
        //        .deleteCookies(cookieNamesToClear);   //指定在注销成功时要删除的cookie名称

    }

    /**
     * 用户信息服务
     * @return
     */
    @Override
    protected UserDetailsService userDetailsService() {
        InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
        manager.createUser(User.withUsername("admin").password("admin").roles("ADMIN").build());
        manager.createUser(User.withUsername("zhangsan").password("hello").roles("USER").build());
        return manager;
    }


    /**
     * 认证信息管理
     * @param auth
     * @throws Exception
     */
    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService());
    }

}
