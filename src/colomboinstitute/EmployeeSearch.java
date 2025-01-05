/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colomboinstitute;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP
 */
public class EmployeeSearch {
    
    public static void main(String[] args) {
        String fileName = "Employee.txt";
        String searchName = "John"; // Change this to the name you want to search for

        List<String[]> employeeData = readEmployeeData(fileName);
        displayEmployeeDetails(employeeData, searchName);
    }

    public static List<String[]> readEmployeeData(String fileName) {
        List<String[]> employeeData = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] employeeDetails = line.split(",");
                employeeData.add(employeeDetails);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return employeeData;
    }

    public static void displayEmployeeDetails(List<String[]> employeeData, String searchName) {
        boolean found = false;
        System.out.println("Employee Details:");
        System.out.println("Name\t\t\tID\t\t\tDepartment");

        for (String[] employee : employeeData) {
            if (employee[0].equalsIgnoreCase(searchName)) {
                found = true;
                System.out.printf("%-20s%-15s%-15s\n", employee[0], employee[1], employee[2]);
            }
        }

        if (!found) {
            System.out.println("Employee with name '" + searchName + "' not found.");
        }
    }
    
}
