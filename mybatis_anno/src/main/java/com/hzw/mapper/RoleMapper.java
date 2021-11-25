package com.hzw.mapper;

import com.hzw.domain.Role;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author Godliness
 * @date 2021/10/18 19:41
 * @Description
 */
public interface RoleMapper {
    @Select("SELECT * FROM sys_user_role ur,sys_role r WHERE ur.roleId=r.id AND ur.userId=#{uid}")
    public List<Role> findByUid(int uid);
}
