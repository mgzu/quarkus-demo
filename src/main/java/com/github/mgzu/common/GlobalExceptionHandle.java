package com.github.mgzu.common;

import com.github.mgzu.common.entity.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author MaGuangZu
 * @since 2023-08-25
 */
@Slf4j
@Component
@RestControllerAdvice
public class GlobalExceptionHandle {

    @ExceptionHandler(Exception.class)
    public Result exception(Exception e) {
        log.error(e.getMessage(), e);
        return Result.builder()
                .code(HttpStatus.INTERNAL_SERVER_ERROR.value())
                .message("Unknown Error")
                .build();
    }

}
