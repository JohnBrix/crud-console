package com.crud.controller;

import com.crud.model.Model;
import com.crud.service.Service;
import com.crud.service.impl.ImplService;

import java.sql.SQLException;
import java.util.Scanner;

//input of the data
public class Controller {

    public void inputSave() throws SQLException {
        Scanner input = new Scanner(System.in);
        String firstName,lastName;
        Integer age;

        System.out.println("Your firstname: ");
        firstName = input.nextLine();
        System.out.println("Your lastname: ");
        lastName = input.nextLine();
        System.out.println("your age: ");
        age = input.nextInt();

        Model model = new Model(firstName,lastName,age);

        Service service = new ImplService();
        service.saveData(model);
    }
}
