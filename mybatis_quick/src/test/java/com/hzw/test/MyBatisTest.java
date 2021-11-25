package com.hzw.test;

import com.hzw.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.lf5.util.Resource;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author Godliness
 * @date 2021/10/16 18:49
 * @Description
 */
public class MyBatisTest {
    @Test
    public void test1() throws IOException {
        //获取核心配置文件
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        //获得Session工厂对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        //获得Session会话对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //执行操作，参数：namespace+id
        List<User> userList = sqlSession.selectList("userMapper.findAll");
        //打印数据
        System.out.println(userList);
        //释放资源
        sqlSession.close();
    }
    @Test
    public void test2() throws IOException {

        //模拟User对象
        User user = new User();
        user.setUsername("tom");
        user.setPassword("abc");
        //获取核心配置文件
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        //获得Session工厂对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        //获得Session会话对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //执行操作，参数：namespace+id
        sqlSession.insert("userMapper.save",user);
        //提交事务
        sqlSession.commit();

        //释放资源
        sqlSession.close();
    }
    @Test
    public void test3() throws IOException {

        //模拟User对象
        User user = new User();
        user.setId(6);
        user.setUsername("lucy");
        user.setPassword("1234");
        //获取核心配置文件
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        //获得Session工厂对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        //获得Session会话对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //执行操作，参数：namespace+id
        sqlSession.update("userMapper.update",user);
        //提交事务
        sqlSession.commit();
        //释放资源
        sqlSession.close();
    }
    @Test
    public void test4() throws IOException {

        //模拟User对象
        User user = new User();
        user.setId(6);
        //获取核心配置文件
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        //获得Session工厂对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        //获得Session会话对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //执行操作，参数：namespace+id
        sqlSession.delete("userMapper.delete",user);
        //提交事务
        sqlSession.commit();
        //释放资源
        sqlSession.close();
    }
}
