package com.xworkz.register.repository;

import com.xworkz.register.entity.RegisterEntity;

public interface RegisterDAO {

    void saveData(RegisterEntity entity);

    RegisterEntity findByGmail(String gmail);
}
