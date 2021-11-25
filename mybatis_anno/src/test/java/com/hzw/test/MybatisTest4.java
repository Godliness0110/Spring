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
 * @date 2021/10/18 19:46
 * @Description
 */
public class MybatisTest4 {
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
        List<User> userAndOrderAll = mapper.findUserAndRoleAll();
        for (User user : userAndOrderAll) {
            System.out.println(user);
        }
    }
}
