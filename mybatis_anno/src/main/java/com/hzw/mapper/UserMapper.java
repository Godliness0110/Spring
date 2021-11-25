package com.hzw.mapper;

import com.hzw.domain.Role;
import com.hzw.domain.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author Godliness
 * @date 2021/10/18 15:06
 * @Description
 */
public interface UserMapper {
    @Insert("insert into user values(#{id},#{username},#{password},#{birthday})")
    public void save(User user);
    @Update("update user set username=#{username},password=#{password} where id=#{id}")
    public void update(User user);
    @Delete("delete * from user where id=#{id}")
    public void delete(int id);
    @Select("select * from user where id=#{id}")
    public User findById(int id);
    @Select("select * from user")
    public List<User> findAll();
    @Select("select * from user")
    @Results({
            @Result(id = true, column = "id", property = "id"),
            @Result(column = "username", property = "username"),
            @Result(column = "password", property = "password"),
            @Result(
                    property = "orderList",
                    column = "id",
                    javaType = List.class,
                    many = @Many(select = "com.hzw.mapper.OrderMapper.findByUid")
            )

    })
    public List<User> findUserAndOrderAll();




    @Select("SELECT * FROM `user`")
    @Results({
            @Result(id = true,column = "id",property = "id"),
            @Result(column = "username",property = "username"),
            @Result(column = "password",property = "password"),
            @Result(
                    property = "roleList",
                    column = "id",
                    javaType = List.class,
                    many = @Many(select = "com.hzw.mapper.RoleMapper.findByUid")
            )
    })
    public List<User> findUserAndRoleAll();

}
