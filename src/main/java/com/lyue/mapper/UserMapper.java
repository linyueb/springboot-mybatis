package com.lyue.mapper;
 
import com.lyue.entity.User;
import org.springframework.stereotype.Repository;
 

@Repository
public interface UserMapper {
    User Sel(int id);
}