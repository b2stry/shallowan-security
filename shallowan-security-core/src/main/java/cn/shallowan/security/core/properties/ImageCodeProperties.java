package cn.shallowan.security.core.properties;

import lombok.Data;

/**
 * @author ShallowAn
 */
@Data
public class ImageCodeProperties {

    /**
     * 验证码宽度
     */
    private Integer width = 67;
    /**
     * 验证码高度
     */
    private Integer height = 23;
    /**
     * 验证码长度
     */
    private Integer length = 4;
    /**
     * 验证码过期时间
     */
    private Integer expireIn = 60;

    /**
     * 需要验证码的url字符串，用英文逗号隔开
     */
    private String url = "";

}
