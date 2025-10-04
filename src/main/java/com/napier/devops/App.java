package com.napier.devops;

import java.util.ArrayList;

public class App
{
    public DB_Connection db = new DB_Connection();
    public Query_Manager query = new Query_Manager();

    public static void main(String[] args)
    {
        // Create new Application
        App a = new App();

        // Connect to database
        a.db.connect();

        // Get an employees details from empolyee number
        // a.printEmployee(255530);

        // Get all employees salaries
        a.printAllSalaries();

        // Disconnect from database
        a.db.disconnect();
    }

    /**
     * Requests employee information from database using employee id number and prints to screen.
     */
    public void printEmployee(int emp_no)
    {
        // Get Employee
        Employee emp = query.getEmployee(emp_no, db.getConnection());

        // Display results
        if (emp != null) System.out.println(emp);
    }

    /**
     * Requests all employee salaries from database and prints to screen.
     */
    public void printAllSalaries()
    {
        // Get all salaries
        ArrayList<Employee> emps = query.getAllSalaries(db.getConnection());

        // Display results
        // Print header
        System.out.printf("%-10s %-15s %-20s %-8s%n", "Emp No", "First Name", "Last Name", "Salary");
        // Print list
        for (Employee emp : emps)
        {
            System.out.printf("%-10s %-15s %-20s %-8s%n", emp.emp_no, emp.first_name, emp.last_name, emp.salary);
        }
    }
}
