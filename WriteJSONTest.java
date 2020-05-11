package com.company;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import javax.imageio.IIOException;
import java.io.FileWriter;
import java.io.IOException;

public class WriteJSONTest {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        //First Employee
        JSONObject employeeDetails = new JSONObject();
        employeeDetails.put("firstName", "Dang");
        employeeDetails.put("lastName", "Kim thi");
        employeeDetails.put("website", "codelean.vn");

        JSONObject employeeObject = new JSONObject();
        employeeObject.put("employee", employeeDetails);

        //Second Employee
        JSONObject employeeDetails2 = new JSONObject();
        employeeDetails2.put("firstName", "Code");
        employeeDetails2.put("lastName","Lean");
        employeeDetails2.put("website", "codelean.com");

        JSONObject employeeObject2 = new JSONObject();
        employeeObject2.put("employee", employeeDetails2);

        //Add employees to list
        JSONArray employeelist = new JSONArray();
        employeelist.add(employeeObject);
        employeelist.add(employeeObject2);

        //Write JSon file
        try(FileWriter file = new FileWriter("employees.json")) {
            file.write(employeelist.toJSONString());
            file.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
