package com.mg.sharedingjdbc.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@TableName("t_order")
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    private Long id;
    private String orderNo;
}
