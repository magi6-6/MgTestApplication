package com.mg.sharedingjdbc.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mg.sharedingjdbc.domain.Order;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderMapper extends BaseMapper<Order> {
}
