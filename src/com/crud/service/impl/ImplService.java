package com.crud.service.impl;

import com.crud.model.Model;
import com.crud.repository.Repository;
import com.crud.service.Service;

import java.sql.SQLException;

public class ImplService implements Service {

    @Override
    public void saveData(Model model) throws SQLException {
        Repository repository = new Repository();
        repository.save(model);
    }
}
