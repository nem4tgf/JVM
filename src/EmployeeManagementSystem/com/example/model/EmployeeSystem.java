//package EmployeeManagementSystem.com.example.model;
//
//import EmployeeManagementSystem.com.example.entity.Employee;
//
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Scanner;
//
//class CustomException extends Exception {
//
//    private static final long serialVersionUID = 1L;
//
//    public CustomException (String str){
//        super();
//        System.out.println(str);
//        EmployeeSystem.operations();
//    }
//}
//public class EmployeeSystem {
//    public static Map<Integer,Employee> map = new HashMap<~>();
//
//    public static void addEmployeee (String name, int age, int id){
//        Employee emp = new Employee(name, age, id);
//        map.put(id,emp);
//
//        operations();
//    }
//
//    public static void deleteEmployeee (int EmpId) throws CustomException{
//        if (map.containsKey(EmpId)){
//            map.remove(EmpId);
//            System.out.println("Successfully Deleted from the List !!");
//        }else {
//            throw new CustomException("Not Found Exception");
//        }
//        operations();
//    }
//
//    public static void searchEmployeee(int EmpId) throws CustomException{
//        if (map.containsKey(EmpId)){
//            //map.get(EmpId);
//            System.out.println("Employee Details :~ " + map.get(EmpId));
//        } else {
//            throw new CustomException("Not Found Exception");
//        }
//        operations();
//    }
//
//}
