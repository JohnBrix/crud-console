package com.crud.service;

import com.crud.model.Model;

import java.sql.SQLException;

public interface Service {
    void saveData(Model model) throws SQLException;
}
