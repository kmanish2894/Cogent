package com.jdbcassg;

import java.sql.SQLException;
import java.util.Scanner;

public class ConsoleCRUDS {

    public static void main(String[] args) throws SQLException {
        DisplayMenu();
    }

    public static void DisplayMenu() throws SQLException {
        Scanner userInput = new Scanner(System.in);
        String READ_MENU;

        // Display menu
       
        System.out.println("            CRUD JAVA EXAMPLE          ");
        
        System.out.println(" Options:                              ");
        System.out.println("1. Create Database Records     ");
        System.out.println("2. Read Database Records       ");
        System.out.println("3. Update Database Records     ");
        System.out.println("4. Delete Database Records     ");
        System.out.println("5. Search Database Records     ");
        System.out.println("6. Exit                        ");
        

        System.out.print("Select option: ");

        READ_MENU = userInput.next();

//display menu based on user selection
        switch (READ_MENU) {
            case "1":
                Create create = new Create();
                break;
            case "2":
                Read read = new Read();
                break;
            case "3":
                Update update = new Update();
                break;
            case "4":
                Delete delete = new Delete();
                break;
            case "5":
                Search search = new Search();
                break;
            case "6":
                System.exit(0);
                break;
            default:
                System.out.println("Invalid selection");
                break; 
        }
    }
}