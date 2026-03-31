package application;

import entities.model.Department;
import entities.model.Seller;

import java.util.Date;

public class Main{
    public static void main(String[] args) {
        Department department = new Department(1,"books");
        Seller seller = new Seller(21,"Bob","bob@gmail.com",new Date(),3000.00,department);

        System.out.println(department);
        System.out.println(seller);
    }
}