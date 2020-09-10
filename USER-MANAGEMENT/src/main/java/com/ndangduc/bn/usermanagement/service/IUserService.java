package com.ndangduc.bn.usermanagement.service;

import com.ndangduc.bn.usermanagement.model.request.CreateUserRequest;
import com.ndangduc.bn.usermanagement.model.response.UserDTO;
import org.springframework.stereotype.Service;

@Service
public interface IUserService {
    UserDTO createUser(CreateUserRequest createUserRequest);
}
