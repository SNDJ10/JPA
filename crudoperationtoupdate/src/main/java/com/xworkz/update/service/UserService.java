package com.xworkz.update.service;



import com.xworkz.update.dto.UserDTO;

import java.util.List;

public interface UserService {

    String userValidation(UserDTO userDTO);




    UserDTO getExistingUserValidationByEmail(String email);

    List<UserDTO> getAllUsersListFromDB();

    UserDTO getExistingUserToUpdateData(Integer id);
}