package com.mg.sharedingjdbc;

import com.mg.sharedingjdbc.domain.User;
import com.mg.sharedingjdbc.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ReadWriteTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void testInsert() {
        userMapper.insert(new User(null, "张三", 20));
        userMapper.insert(new User(null, "李四", 21));
        userMapper.insert(new User(null, "王五", 22));
    }
    @Test
    public void testSelect() {
        // 看打印的sql轮询
        userMapper.selectList(null).forEach(System.out::println);
        userMapper.selectList(null).forEach(System.out::println);
        userMapper.selectList(null).forEach(System.out::println);
        userMapper.selectList(null).forEach(System.out::println);
        userMapper.selectList(null).forEach(System.out::println);
        userMapper.selectList(null).forEach(System.out::println);
        userMapper.selectList(null).forEach(System.out::println);
        userMapper.selectList(null).forEach(System.out::println);
        userMapper.selectList(null).forEach(System.out::println);
    }

    /**
     * 加了事务后，为了保证主从库间事务一致性，避免跨服务的分布式事务，shardingsphere-jdbc的主从模型中，事务的读写均使用主库
     * 注：junit 测试方法默认是事务回滚的
     */
    @Transactional
    @Test
    public void testTransaction() {
        userMapper.insert(new User(null, "赵六", 25));
        userMapper.selectList(null).forEach(System.out::println);
    }
}
