package com.mg.json;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.mg.json.domain.Category;
import com.mg.json.domain.Material;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Hello world!
 */
public class Application {
//    public static final String JSON_PATH = "D:\\Code\\Public\\MgTestApplication\\mg-json\\src\\main\\resources\\mar.json";
    public static final String JSON_PATH = "D:\\Code\\Public\\MgTestApplication\\mg-json\\src\\main\\resources\\test1.json";

    public static void main(String[] args) throws IOException {
        File file = new File(JSON_PATH);
        String content = FileUtils.readFileToString(file, StandardCharsets.UTF_8);
        List<Category> categoryList = JSON.parseArray(content, Category.class);
        List<Material> materialRsList = new ArrayList<>();
        List<Category> categoryRsList = new ArrayList<>();
        for (Category category : categoryList) {
            categoryRsList.addAll(getAllCategorys(category, materialRsList));
        }

        System.out.println("args = " + Arrays.toString(args));
    }

    private static List<Category> getAllCategorys(Category category, List<Material> materialRsList) {
        if (CollectionUtils.isNotEmpty(category.getMaterials())) {
            List<Material> materials = category.getMaterials().stream().map(item -> {
                item.setDbId(category.getDbId());
                return item;
            }).collect(Collectors.toList());
            materialRsList.addAll(materials);
        }

        List<Category> children = category.getChildren();
        List<Category> result = new ArrayList<>();
        if (CollectionUtils.isNotEmpty(children)) {
            result = new ArrayList<>(children);
            for (Category child : children) {
                result.addAll(getAllCategorys(child, materialRsList));
            }
        }
        return result;
    }
}
