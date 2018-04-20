package cn.shallowan.security.core.validate;

import org.springframework.web.context.request.ServletWebRequest;

/**
 * @author ShallowAn
 */
public interface ValidateCodeGenerator {
    ImageCode generate(ServletWebRequest request);
}
