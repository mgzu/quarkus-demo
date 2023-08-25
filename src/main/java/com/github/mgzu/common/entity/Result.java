package com.github.mgzu.common.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * @author MaGuangZu
 * @since 2023-08-25
 */
@Builder
@Setter
@Getter
public class Result {
    private int code;
    private String message;
    private Object data;
}
