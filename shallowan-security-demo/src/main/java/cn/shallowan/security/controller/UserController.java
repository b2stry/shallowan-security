package cn.shallowan.security.controller;

import cn.shallowan.security.dto.User;
import cn.shallowan.security.dto.UserQueryCondition;
import com.fasterxml.jackson.annotation.JsonView;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

/**
 * @author ShallowAn
 */
@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {

    @PostMapping
    public User create(@Valid @RequestBody User user, BindingResult errs) {

        if (errs.hasErrors()) {
            errs.getAllErrors().forEach(error -> System.out.println(error.getDefaultMessage()));
        }

        System.out.println(user.getUsername());
        System.out.println(user.getPassword());
        System.out.println(user.getId());
        System.out.println(user.getBrithday());

        user.setId("1");
        return user;

    }

    @PutMapping("/{id:\\d+}")
    public User update(@Valid @RequestBody User user, BindingResult errs) {

        if (errs.hasErrors()) {
            errs.getAllErrors().forEach(error -> System.out.println(error.getDefaultMessage()));
        }

        return user;

    }

    @DeleteMapping("/{id:\\d+}")
    public void delete(@PathVariable String id) {
        System.out.println(id);
    }

    @GetMapping
    @JsonView(User.UserSimpleView.class)
    public List<User> query(UserQueryCondition userQueryCondition, @PageableDefault Pageable pageable) {
        System.out.println(ReflectionToStringBuilder.toString(userQueryCondition, ToStringStyle.MULTI_LINE_STYLE));
        System.out.println(pageable.getPageSize());
        System.out.println(pageable.getPageNumber());
        System.out.println(pageable.getSort());
        List<User> users = new ArrayList<>();
        User user1 = new User();
        User user2 = new User();
        User user3 = new User();
        users.add(user1);
        users.add(user2);
        users.add(user3);
        return users;
    }

    @GetMapping("/{id:\\d+}")
    @JsonView(User.UserDetailView.class)
    public User getInfo(@PathVariable String id) {
        System.out.println(id);
        User user = new User();
        user.setUsername("shallowan");
        return user;
    }
}
