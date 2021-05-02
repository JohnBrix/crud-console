package com.crud;

import com.crud.controller.Controller;
import java.sql.SQLException;

public class MainApplication {

    public static void main(String[] args) throws SQLException {
        //instantiating inheritance
        Controller controller = new Controller();
        controller.inputSave();
    }
}
