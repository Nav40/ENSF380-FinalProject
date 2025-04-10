
package edu.ucalgary.oop;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.time.LocalDate;




public class DatabaseManger {
    private String ConnectionString;
    private boolean isConnected;

    public void connect() {
        // Simulate a database connection
        this.isConnected = true;
        System.out.println("Connected to the database.");
    }

    public void disconnect() {
        // Simulate closing the database connection
        this.isConnected = false;
        System.out.println("Disconnected from the database.");
    }

    public ResultSet executeQuery(String query) {
        // Simulate executing a query and returning a result set
        if (!isConnected) {
            throw new IllegalStateException("Database not connected.");
        }
        System.out.println("Executing query: " + query);
        return new ResultSet(); // Placeholder for actual result set
    }

    public void updateDatabase(String query) {
        // Simulate updating the database
        if (!isConnected) {
            throw new IllegalStateException("Database not connected.");
        }
        System.out.println("Updating database with query: " + query);
    } 
    
    public void deleteData(String query) {
        // Simulate deleting data from the database
        if (!isConnected) {
            throw new IllegalStateException("Database not connected.");
        }
        System.out.println("Deleting data with query: " + query);
    }

    public void loadData(String query) {
        // Simulate loading data from the database
        if (!isConnected) {
            throw new IllegalStateException("Database not connected.");
        }
        System.out.println("Loading data with query: " + query);
    }

    public void saveData(String query) {
        // Simulate saving data to the database
        if (!isConnected) {
            throw new IllegalStateException("Database not connected.");
        }
        System.out.println("Saving data with query: " + query);
    }

}



