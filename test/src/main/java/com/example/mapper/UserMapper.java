package com.example.mapper;

import com.example.pojo.User;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

//@Mapper
@Repository
public interface UserMapper extends Mapper<User> {
//    List<User> findAll();
}
