package cn.shallowan.security.core.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author ShallowAn
 */
@ConfigurationProperties(prefix = "shallowan.security")
@Data
public class SecurityProperties {

    private BrowserProperties browser = new BrowserProperties();

    private ValidateProperties code = new ValidateProperties();
}
