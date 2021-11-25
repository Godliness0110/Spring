package com.hzw.test;

import com.hzw.domain.User;
import com.hzw.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Godliness
 * @date 2021/10/17 16:13
 * @Description
 */
public class MapperTest {
    @Test
    public void test1() throws IOException {
        InputStream resourceAsFile = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsFile);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);


//        User user = new User();
//        user.setId(2);
//        user.setUsername("郭富城");
//        user.setPassword("abc123");

        //模拟Ids数据
        List<Integer> ids = new ArrayList<Integer>();
        ids.add(2);

        List<User> userList = mapper.findByIds(ids);
        System.out.println(userList);
    }
}
