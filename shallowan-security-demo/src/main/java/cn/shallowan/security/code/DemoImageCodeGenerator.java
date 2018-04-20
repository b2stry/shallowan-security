package cn.shallowan.security.code;

import cn.shallowan.security.core.validate.ImageCode;
import cn.shallowan.security.core.validate.ValidateCodeGenerator;
import org.springframework.web.context.request.ServletWebRequest;

/**
 * @author ShallowAn
 */
//@Component("imageCodeGenerator")
public class DemoImageCodeGenerator implements ValidateCodeGenerator {
    @Override
    public ImageCode generate(ServletWebRequest request) {
        System.out.println("更高级的图形验证码");
        return null;
    }
}
