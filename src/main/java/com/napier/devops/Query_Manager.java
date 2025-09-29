package com.napier.devops;

import java.sql.*;

public class Query_Manager
{
    /**
     * Get employee information from database using employee id number
     */
    public Employee getEmployee(int ID, Connection con)
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT e.emp_no, e.first_name, e.last_name, t.title, s.salary, d.dept_name, m.first_name, m.last_name "
                            + "FROM employees e "
                            + "JOIN titles t ON e.emp_no = t.emp_no AND t.to_date = '9999-01-01' "
                            + "JOIN salaries s ON e.emp_no = s.emp_no AND s.to_date = '9999-01-01' "
                            + "JOIN dept_emp de ON e.emp_no = de.emp_no AND de.to_date = '9999-01-01' "
                            + "JOIN departments d ON de.dept_no = d.dept_no "
                            + "JOIN dept_manager dm ON de.dept_no = dm.dept_no AND dm.to_date = '9999-01-01' "
                            + "JOIN employees m ON dm.emp_no = m.emp_no "
                            + "WHERE e.emp_no = " + ID;
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            // Return new employee if valid.
            // Check one is returned
            if (rset.next())
            {
                Employee emp = new Employee();
                emp.emp_no = rset.getInt("e.emp_no");
                emp.first_name = rset.getString("e.first_name");
                emp.last_name = rset.getString("e.last_name");
                emp.title = rset.getString("t.title");
                emp.salary = rset.getInt("s.salary");
                emp.dept_name = rset.getString("d.dept_name");
                emp.manager = rset.getString("m.first_name");
                emp.manager += (" ");
                emp.manager += rset.getString("m.last_name");
                return emp;
            }
            else
                return null;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get employee details");
            return null;
        }
    }
}
