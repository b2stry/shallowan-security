package cn.shallowan.security.browser.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

/**
 * @author ShallowAn
 */
@Component
@Slf4j
public class ShallowanUserDetailsService implements UserDetailsService {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        log.info("登录用户名：" + username);
        //根据用户名查找用户信息
        //根据查找到的用户信息判断用户是否冻结
        String password = passwordEncoder.encode("123456");
        log.info("数据库密码是：" + password);
        return new User(username, password,
                true, true, true, true, AuthorityUtils.commaSeparatedStringToAuthorityList("admin"));
    }
}
