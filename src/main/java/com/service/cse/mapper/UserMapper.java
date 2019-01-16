package com.service.cse.mapper;

import com.service.cse.domain.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    User selectUser(Integer id);
}
