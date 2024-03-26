package com.mg.json.domain;

import lombok.Data;

import java.util.List;

/**
 * @Author Magi
 * @Date 2023/11/22 21:53
 * @Version 1.0
 * @Description
 */
@Data
public class Category {
    private String dbId;
    private String dbParent;
    private String dbName;
    private String dbValue;
    private String combine;
    private List<Category> children;
    private List<Material> materials;
}
