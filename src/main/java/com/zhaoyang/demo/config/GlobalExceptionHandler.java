package com.zhaoyang.demo.config;

import com.zhaoyang.demo.util.ResultVO;
import lombok.extern.java.Log;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;

/**
 * @author 曾昭阳
 * @date 2020/6/1 13:22
 * <p>
 * 全局的错误拦截
 */

@Log
@RestController
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = SQLException.class)
    public ResultVO<Object> unauthorizedHandler(SQLException u) {
        return ResultVO.ERROR(u.getMessage());
    }
}