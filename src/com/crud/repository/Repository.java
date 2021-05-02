package com.crud.repository;

import com.crud.database.Database;
import com.crud.model.Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Repository {
    //ctrl + alt + shift + s
    public void save(Model model)throws NullPointerException,SQLException{
        Connection connection = Database.getConnection();
        PreparedStatement ps;
            ps = connection.prepareStatement("INSERT INTO `information`(`firstname`, `lastname`, `age`) VALUES (?,?,?)");
            ps.setString(1, model.getFirstName() );
            ps.setString(2, model.getLastName());
            ps.setInt(3, model.getAge() );
            ps.executeUpdate();
            System.out.println("SUCCESS");
    }
}
