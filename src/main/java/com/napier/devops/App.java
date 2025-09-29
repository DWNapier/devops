package com.napier.devops;

public class App
{
    public static void main(String[] args)
    {
        // Create new Application
        DB_Connection db = new DB_Connection();
        Query_Manager query = new Query_Manager();

        // Connect to database
        db.connect();

        // Get Employee
        Employee emp = query.getEmployee(255530, db.getConnection());

        // Display results
        if (emp != null) System.out.println(emp);

        // Disconnect from database
        db.disconnect();
    }
}
