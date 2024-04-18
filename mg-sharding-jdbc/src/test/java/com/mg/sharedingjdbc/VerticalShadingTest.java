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
public class VerticalShadingTest {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private OrderMapper orderMapper;

    @Test
    @Transactional
    public void testInsert() {
        userMapper.insert(new User(null, "阿强", 21));
        orderMapper.insert(new Order(null, "no001"));
    }
}
