package com.mg.exception.config;

import com.mg.common.domain.AjaxResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static com.mg.common.domain.enums.ExceptionCodeEnum.VALID_ERROR;

/**
 * @Author Magi
 * @Date 2023/7/23 14:54
 * @Version 1.0
 * @Description
 */
//@ControllerAdvice
//@ResponseBody
@RestControllerAdvice(basePackages = "com.mg.exception.controller")
public class ExceptionAdvice {
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public AjaxResult handleValidException(MethodArgumentNotValidException e) {
        List<FieldError> fieldErrors = e.getBindingResult().getFieldErrors();
        Map<String, String> errorMap = fieldErrors.stream()
                .collect(Collectors.toMap(FieldError::getField, FieldError::getDefaultMessage));
        return AjaxResult.error(VALID_ERROR.getCode(), VALID_ERROR.getMsg()).put("data", errorMap);
    }

    // 未知异常
    @ExceptionHandler(Throwable.class)
    public AjaxResult handleException(Throwable throwable) {
        return AjaxResult.error(throwable.getMessage());
    }

}
