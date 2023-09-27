package com.github.mgzu.common.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

/**
 * @author MaGuangZu
 * @since 2023-08-25
 */
@Builder
@Setter
@Getter
public class R<T> {

    private int code;
    private String message;
    private T data;

    public static <T> R<T> success(T data) {
        return R.<T>builder()
                .code(HttpStatus.OK.value())
                .message(HttpStatus.OK.getReasonPhrase())
                .data(data)
                .build();
    }

    public static <T> R<T> error() {
        return R.<T>builder()
                .code(HttpStatus.INTERNAL_SERVER_ERROR.value())
                .message(HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase())
                .build();
    }

    public static <T> R<T> error(T data) {
        return R.<T>builder()
                .code(HttpStatus.INTERNAL_SERVER_ERROR.value())
                .message(HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase())
                .data(data)
                .build();
    }

    public static <T> R<T> error(HttpStatus httpStatus, T data) {
        return R.<T>builder()
                .code(httpStatus.value())
                .message(httpStatus.getReasonPhrase())
                .data(data)
                .build();
    }
}
