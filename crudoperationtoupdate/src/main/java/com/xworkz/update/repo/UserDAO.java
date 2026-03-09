package com.xworkz.update.repo;



import com.xworkz.update.entity.UserEntity;

import java.util.List;

public interface UserDAO {

    boolean userDetailsSaveToDb(UserEntity userEntity);

    UserEntity getExistUserByEmail(String email);

    List<UserEntity> getAllUsersListfromDB();

    UserEntity getingUserToUpdateDataFromDBByID(Integer id);
}
