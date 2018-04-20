package cn.shallowan.security.core.properties;

import cn.shallowan.security.core.enums.LoginTypeEnum;
import lombok.Data;

/**
 * @author ShallowAn
 */
@Data
public class BrowserProperties {

    private String loginPage = "/signin.html";

    private LoginTypeEnum loginType = LoginTypeEnum.JSON;

    private Integer rememberMeSeconds = 3600;
}
