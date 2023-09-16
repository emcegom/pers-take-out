package org.emcegom.project.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.emcegom.project.entity.User;
import org.emcegom.project.mapper.UserMapper;
import org.emcegom.project.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}