package main.java.ro.jademy.carrental.model.data;

import main.java.ro.jademy.carrental.model.Person.Customer;
import main.java.ro.jademy.carrental.model.Person.Salesman;

import java.util.ArrayList;

public class dataProvider {

    public static ArrayList<Customer> getCustomerList(){
        ArrayList<Customer> customerList = new ArrayList<>();

        Customer customer1 = new Customer("Marian", "Vlasu", "1930122133215"); customerList.add(customer1);
        Customer customer2 = new Customer("Johnny", "Meran", "1430356234567"); customerList.add(customer2);
        Customer customer3 = new Customer("Catalin", "Balan", "1234567890123"); customerList.add(customer3);
        Customer customer4 = new Customer("Cristian", "Manole", "2345678901234"); customerList.add(customer4);
        Customer customer5 = new Customer("Madalina", "Stoica", "3456789012345"); customerList.add(customer5);
        Customer customer6 = new Customer("Andreea", "Stanciu", "4456789012346"); customerList.add(customer6);
        Customer customer7 = new Customer("Paula", "Popescu", "5456789012347"); customerList.add(customer7);
        Customer customer8 = new Customer("Vlad", "Popescu", "7456789012348"); customerList.add(customer8);
        Customer customer9 = new Customer("Marian", "Butnaru", "8456789012349"); customerList.add(customer9);
        Customer customer10 = new Customer("Alexandru", "Stefanov", "9456789012340"); customerList.add(customer10);

        return customerList;
    }

    public static ArrayList<Salesman> getSalesmanList(){
        ArrayList<Salesman> salesmanList = new ArrayList<>();

        Salesman salesman1 = new Salesman("Victor", "Iordache", "1922323136315",1,"victor.iordache","victor.password"); salesmanList.add(salesman1);
        Salesman salesman2 = new Salesman("Victor", "Iordache", "1983235655211",1,"victor.iordache","victor.password"); salesmanList.add(salesman1);
        Salesman salesman3 = new Salesman("Victor", "Iordache", "1912345698763",1,"victor.iordache","victor.password"); salesmanList.add(salesman1);

        return salesmanList;
    }
}
