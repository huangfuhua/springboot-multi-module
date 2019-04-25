package com.hfh.springbootmultimodule.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by huangfuhua on 2019/4/25.
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Response {
    private Integer result;
    private String message;
    private Object data;

    @AllArgsConstructor
    public enum RESULT_CODE {
        SUCCESS(200),
        PARAM_ERROR(400);
        private int code;

        public int getCode() {
            return code;
        }

        public void setCode(int code) {
            this.code = code;
        }
    }
}
