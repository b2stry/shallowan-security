package cn.shallowan.security.core.response;

import lombok.Data;

/**
 * @author ShallowAn
 */
@Data
public class SimpleResponse {
    private SimpleResponse() {

    }

    public SimpleResponse(Object content) {
        this.content = content;
    }

    private Object content;

}
