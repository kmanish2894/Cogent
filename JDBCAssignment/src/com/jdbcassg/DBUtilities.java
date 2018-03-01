package com.jdbcassg;

import java.sql.*;

public class DBUtilities {
    // database URL                              

    static final String DATABASE_URL = "jdbc:oracle:thin:@localhost:1521:orcl";
    Connection connection = null;
    Statement statement = null; 
    ResultSet resultSet = null; 

    public DBUtilities() throws SQLException {
        // establish connection to database  
        try {
            connection = DriverManager.getConnection(DATABASE_URL, "c##manish", "Cogent123");

        } catch (SQLException ex) {
            System.out.println("The following error has occured: " + ex.getMessage());
        }
    }

    public void DisconnectFromDB() {

        try {
            resultSet.close();
            statement.close();
            connection.close();
        } // end try                                               
        catch (Exception ex) {
            System.out.println("The following error has occured: " + ex.getMessage());
        } // end catch  
    }

    public ResultSet ReadRecords(String sql_stmt) {
        try {

            statement = connection.createStatement();
                                    
            resultSet = statement.executeQuery(sql_stmt);

            return resultSet;

        } 
        catch (SQLException ex) {
            System.out.println("The following error has occured: " + ex.getMessage());
        }                                                    

        return resultSet;
    }

    public void ExecuteSQLStatement(String sql_stmt) {
        try {
            statement = connection.createStatement();
                                    
            statement.execute(sql_stmt);
        } 
        catch (SQLException ex) {
            System.out.println("The following error has occured: " + ex.getMessage());
        }
    }
}
