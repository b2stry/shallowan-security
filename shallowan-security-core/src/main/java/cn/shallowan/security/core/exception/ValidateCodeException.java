package cn.shallowan.security.core.exception;


import org.springframework.security.core.AuthenticationException;

/**
 * @author ShallowAn
 */
public class ValidateCodeException extends AuthenticationException {

    /**
     * Constructs an {@code AuthenticationException} with the specified message and no
     * root cause.
     *
     * @param msg the detail message
     */
    public ValidateCodeException(String msg) {
        super(msg);
    }
}
