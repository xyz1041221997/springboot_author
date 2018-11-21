package cn.xyz.springboot_author.config;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@EnableWebSecurity
public class MyConfig extends WebSecurityConfigurerAdapter{
    @Override
    protected void configure(HttpSecurity http) throws Exception {
//        super.configure(http);
        http.authorizeRequests().antMatchers("/").permitAll()
                .antMatchers("/leve1/**").hasRole("VIP1")
                .antMatchers("/level2/**").hasRole("VIP2")
                .antMatchers("/level3/**").hasRole("VIP#");
         //开启自动配页面登入,如果没有登入没有权限就会到登入界面
        http.formLogin().loginPage("/userlogin");//自定义的登入界面

        http.logout();

        http.rememberMe();
    }
    //自定义认证

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        super.configure(auth);
          auth.inMemoryAuthentication().passwordEncoder(new BCryptPasswordEncoder())
                  .withUser("zhangsan").password(new BCryptPasswordEncoder().encode("123456")).roles("VIP1")
                  .and()
                  .withUser("李四").password(new BCryptPasswordEncoder().encode("123456")).roles("VIP2")
                  .and()
                  .withUser("王五").password(new BCryptPasswordEncoder().encode("123456")).roles("VIP2");

    }
}































































































































































