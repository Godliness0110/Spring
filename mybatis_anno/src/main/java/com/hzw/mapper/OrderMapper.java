package com.hzw.mapper;

import com.hzw.domain.Order;
import com.hzw.domain.User;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author Godliness
 * @date 2021/10/18 15:38
 * @Description
 */
public interface OrderMapper {


    @Select("select * from orders where uid=#{uid}")
    public List<Order> findByUid(int uid);
//    @Select("select *,o.id oid from user u,orders o where o.uid=u.id")
//    @Results({
//            @Result(column = "uid",property = "id"),
//            @Result(column = "ordertime",property = "ordertime"),
//            @Result(column = "total",property = "total"),
//            @Result(column = "oid",property = "user.id"),
//            @Result(column = "username",property = "user.username"),
//            @Result(column = "password",property = "user.password"),
//
//    })
@Select("select * from orders")
@Results({
        @Result(column = "uid",property = "id"),
        @Result(column = "ordertime",property = "ordertime"),
        @Result(column = "total",property = "total"),
        @Result(
                property = "user",//要封装的属性名称
                column = "uid",//根据哪个字段去查询user表的数据
                javaType = User.class,//要封装的实体
                //select属性代表查询哪个接口的方法获得数据
                one = @One(select = "com.hzw.mapper.UserMapper.findById")
        )

})
    public List<Order> findAll();
}
