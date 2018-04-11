package cn.shallowan.security.dto;

import lombok.Data;

/**
 * @author ShallowAn
 */
@Data
public class UserQueryCondition {

    private String username;

    private int age;

    private int ageTo;

    private String xxx;

    @Override
    public String toString() {
        return "UserQueryCondition{" +
                "username='" + username + '\'' +
                ", age=" + age +
                ", ageTo=" + ageTo +
                ", xxx='" + xxx + '\'' +
                '}';
    }
}
