package com.mg.json.domain;

import lombok.Data;

/**
 * @Author Magi
 * @Date 2023/11/22 21:54
 * @Version 1.0
 * @Description
 */
@Data
public class Material {
    private String status;
    private String code;
    private String name;
    private String drawno;
    private String material;
    private String unit;
    private String creayeTime;
    private String creator;
    private String modify;
    private String modifyTime;
    private String id;

    // Category的dbId
    private String dbId;
}
