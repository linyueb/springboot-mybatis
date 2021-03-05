package com.lyue.mapper;
 
import com.lyue.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface UserMapper {
    User Sel(int id);
    List<User> All(String select);

    @Insert("INSERT INTO user(userName,phone) VALUES(#{userName}, #{phone})")
    void insert(User user);

}