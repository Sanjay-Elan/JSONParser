package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.*;


public class Main {
    public static void main(String args[]) throws IOException{
        ObjectMapper objectmapper = new ObjectMapper();
        File f = new File("C:\\Work\\Codes\\Java\\ObjectMapper\\src\\Sample.json");
        Employee emp = objectmapper.readValue(f, Employee.class);
        System.out.println("Employee Object : " +emp);

        Employee emp1 = new Employee();
        emp1.setfirstName("Roger");
        emp1.setlastName("Federer");
        emp1.setEmpID(1568);
        emp1.setdesignation("Tester");
        ObjectMapper obj = new ObjectMapper();
        StringWriter SW = new StringWriter();
        obj.writeValue(SW,emp1);
        String json = SW.toString();
        System.out.println(json);
    }
}

