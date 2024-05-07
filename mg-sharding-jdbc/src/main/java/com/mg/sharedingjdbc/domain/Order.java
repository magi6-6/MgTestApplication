package com.mg.sharedingjdbc.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@TableName("t_order")// 逻辑表名
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    @TableId(type = IdType.ASSIGN_ID)// 分布式id
    private Long id;
    private String orderNo;
    private Long userId;
}
