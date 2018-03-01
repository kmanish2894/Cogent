package com.jdbcassg;

import java.sql.SQLException;
import java.util.Scanner;

public class Create {

    Create() throws SQLException {
        Scanner userInput = new Scanner(System.in);
        System.out.println("You selected option 1: Create database record: ");
        
        int id;
        System.out.println("Enter employer id: ");
        id = userInput.nextInt();
        String name;
        System.out.println("Enter employer name: ");
        name = userInput.next();

        int  salary;
        System.out.println("Enter employer salary: ");
        salary = userInput.nextInt();

       
        DBUtilities dbUtilities = new DBUtilities();
        
        String sql_stmt = "INSERT INTO emp_assg (empid, empname,empsalary) VALUES ('" +id + "','" +name + "','" + salary+"')";
        
        dbUtilities.ExecuteSQLStatement(sql_stmt);
        
        
        ConsoleCRUDS.DisplayMenu();
    }
}
