package com.zhaoyang.demo.dao.mapper;

import com.zhaoyang.demo.entity.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author 曾昭阳
 * @date 2021/2/16 9:35
 * @email 473811301@qq.com
 */
@Mapper
public interface UserMapper {

    @Insert("insert into demo.tb_user(name) values(#{name});")
    boolean insert(String name);

    @Select("select * from demo.tb_user where id = #{id};")
    User getById(int id);

    @Select("select * from demo.tb_user where name = #{name};")
    User getByName(String name);

    @Delete("delete from demo.tb_user where id = #{id};")
    boolean delete(int id);
}
