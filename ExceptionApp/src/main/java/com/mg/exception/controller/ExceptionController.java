package com.mg.exception.controller;

import com.mg.common.domain.AjaxResult;
import com.mg.exception.domain.User;
import com.mg.exception.valid.group.AddGroup;
import com.mg.exception.valid.group.EditGroup;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @Author Magi
 * @Date 2023/7/23 11:10
 * @Version 1.0
 * @Description
 */
@RestController
@RequestMapping("/exception")
public class ExceptionController {

    // 加了@Valid注解，就会去执行User类中的注解
    // 加了BindingResult，接收异常，不加BindingResult会抛出异常
    /*@PostMapping("/user")
    public AjaxResult user(@RequestBody @Valid User user, BindingResult result) {
        if (result.hasErrors()) {
            result.getFieldErrors().stream().forEach(error -> {
                System.out.println(error.getField() + ":" + error.getDefaultMessage());
            });
        }
        return AjaxResult.success("添加成功");
    }*/

    // 统一处理异常
    @PostMapping("/user")
    public AjaxResult user(@RequestBody @Valid User user) {
        return AjaxResult.success("添加成功");
    }


    /** 分组校验
     * 一旦加了分组，就会根据分组去执行校验
     * 不分组的字段，不会执行校验
     * @param user
     * @return
     */
    @PostMapping("/addUser")
    public AjaxResult addUser(@RequestBody @Validated({AddGroup.class}) User user) {
        return AjaxResult.success("添加成功");
    }
    @PostMapping("/editUser")
    public AjaxResult editUser(@RequestBody @Validated(EditGroup.class) User user) {
        return AjaxResult.success("编辑成功");
    }


}
