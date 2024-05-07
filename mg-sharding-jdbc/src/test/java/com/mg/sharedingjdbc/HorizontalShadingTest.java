package com.mg.sharedingjdbc;

import com.mg.sharedingjdbc.domain.Order;
import com.mg.sharedingjdbc.domain.User;
import com.mg.sharedingjdbc.mapper.OrderMapper;
import com.mg.sharedingjdbc.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@RunWith(SpringRunner.class)
public class HorizontalShadingTest {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private OrderMapper orderMapper;

    @Test
    public void testInsert() {
        orderMapper.insert(new Order(null, "horizontalOrder0001", 1L));
    }

    @Test
    public void testInsertOrderDbStrategy() {
        for (int i = 4; i < 8; i++) {
            orderMapper.insert(new Order(null, "horizontalOrder0001", i + 1L));
        }

    }
}
