package com.mg.exception.domain;

import com.mg.exception.valid.custom.StatusValue;
import com.mg.exception.valid.group.AddGroup;
import com.mg.exception.valid.group.EditGroup;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.validation.constraints.Pattern;

/**
 * @Author Magi
 * @Date 2023/7/23 11:24
 * @Version 1.0
 * @Description
 */
@Data
public class User {
    /**
     * 分组校验
     */

    @Null(message = "新增时id必须为空", groups = AddGroup.class)
    @NotNull(message = "修改时id不能为空", groups = EditGroup.class)
    private Long id;

    @NotBlank(message = "修改时用户名必须为空", groups = EditGroup.class)
    @Null(message = "新增时用户名不能为空", groups = AddGroup.class)
    private String name;


    @NotNull(message = "年龄不能为空", groups = {AddGroup.class, EditGroup.class})
    private Integer age;

    @NotBlank(message = "手机号不能为空")
    @Pattern(regexp = "^[1][3,4,5,6,7,8,9][0-9]{9}$", message = "手机号格式有误")
    private String mobile;

    @StatusValue(groups = {AddGroup.class, EditGroup.class})
    private Integer status;
}
