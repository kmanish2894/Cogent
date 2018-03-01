package com.jdbcassg;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Scanner;

public class Search {
	
	public Search() throws SQLException{
		Scanner userInput = new Scanner(System.in);
        System.out.println("You selected option 5: Search database record: ");

        String empid;
        System.out.println("Enter employer id to search: ");
        empid = userInput.next();

        //retrieve record to update
        DisplayRecord(empid);
	}
	
	private void DisplayRecord(String id) throws SQLException{
		try {
			DBUtilities dbUtilities = new DBUtilities();
			String sql_stmt = "SELECT empid, empname, empsalary FROM emp_assg WHERE empid = " + id;
            ResultSet resultSet = dbUtilities.ReadRecords(sql_stmt);
            if (resultSet.next()) {

                ResultSetMetaData metaData = resultSet.getMetaData();
                int numberOfColumns = metaData.getColumnCount();
                System.out.print("Database Records Listing\n");

                for (int i = 1; i <= numberOfColumns; i++) {
                    System.out.printf("%-8s ", metaData.getColumnName(i));
                }
                System.out.println();

                do {
                    for (int i = 1; i <= numberOfColumns; i++) {
                        System.out.printf("%-8s ", resultSet.getObject(i));
                    }
                    System.out.println();
                } while (resultSet.next());

                System.out.println();

            } else {
                System.out.println("No database records found");
            }

            //close db connection
            dbUtilities.DisconnectFromDB();
		}catch (SQLException ex) {
            System.out.println("The following error has occured: " + ex.getMessage());
        } 
	}


}
