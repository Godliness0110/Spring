package com.hzw.test;

import com.hzw.domain.User;
import com.hzw.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author Godliness
 * @date 2021/10/18 15:10
 * @Description
 */
public class MybatisTest {
    private UserMapper mapper;
    @Before
    public void before() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = build.openSession(true);//自动提交事务
        mapper = sqlSession.getMapper(UserMapper.class);

    }

    @Test
    public void testSave(){
        User user = new User();
        user.setUsername("tom");
        user.setPassword("ddd");
        mapper.save(user);
    }
    @Test
    public void testUpdate(){
        User user = new User();
        user.setId(7);
        user.setUsername("hzw");
        user.setPassword("ggg");
        mapper.update(user);
    }
    @Test
    public void testDelete(){
        mapper.delete(7);
    }
    @Test
    public void testFindById(){
        User byId = mapper.findById(2);
        System.out.println(byId);
    }
    @Test
    public void testFindAll(){
        List<User> all = mapper.findAll();
        for (User user : all) {
            System.out.println(user);
        }
    }
}
