package com.jdbcassg;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Scanner;

public class Delete {

    Delete() throws SQLException {
        Scanner userInput = new Scanner(System.in);
        System.out.println("You selected option 4: Delete database record: ");

        String empid;
        System.out.println("Enter employer id to delete: ");
        empid = userInput.next();

        //retrieve record to update
        DisplayRecord(empid);

        String confirm_delete;
        System.out.println("Enter Y to confirm deletion: ");
        confirm_delete = userInput.next();

        if ("Y".equals(confirm_delete)) {
            DBUtilities dbUtilities = new DBUtilities();

            String sql_stmt = "DELETE FROM emp_assg WHERE empid = " + empid;

            dbUtilities.ExecuteSQLStatement(sql_stmt);
            
            System.out.println("The Record has successfully being deleted");
        }

        ConsoleCRUDS.DisplayMenu();
    }

    private void DisplayRecord(String id) throws SQLException {
        try {
            DBUtilities dbUtilities = new DBUtilities();

            String sql_stmt = "SELECT empid, empname, empsalary FROM emp_assg WHERE empid = " + id;
            ResultSet resultSet = dbUtilities.ReadRecords(sql_stmt);

            // process query results
            if (resultSet.next()) {

                ResultSetMetaData metaData = resultSet.getMetaData();
                int numberOfColumns = metaData.getColumnCount();
                System.out.print("Database Records Listing\n\n");

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
        } catch (SQLException ex) {
            System.out.println("The following error has occured: " + ex.getMessage());
        } 
    }
}
