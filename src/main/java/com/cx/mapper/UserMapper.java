package com.cx.mapper;

import com.cx.entity.User;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface UserMapper {
    List<User> getAll();

    User getOne(Long id);

    void insert(User user);

    void update(User user);

    void delete(Long id);
}
