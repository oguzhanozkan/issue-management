package com.oguzhano.issuemanagement.service.impl;

import com.oguzhano.issuemanagement.entity.User;
import com.oguzhano.issuemanagement.repository.UserRepository;
import com.oguzhano.issuemanagement.service.UserService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    private UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }


    @Override
    public User save(User user) {
        if (user.getEmail() == null){
            throw new IllegalArgumentException("User email can not be null");
        }
        return userRepository.save(user);
    }

    @Override
    public User getById(Long id) {
        return userRepository.getOne(id);
    }

    @Override
    public Page<User> getAllPageable(Pageable pageable) {
        return userRepository.findAll(pageable);
    }

    @Override
    public User getByUserName(String username) {
        return userRepository.findByUsername(username);
    }
}
