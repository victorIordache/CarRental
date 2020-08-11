package ro.jademy.carrental;

import ro.jademy.carrental.model.Person.Customer;
import ro.jademy.carrental.model.Person.Salesman;
import ro.jademy.carrental.model.Shop;
import ro.jademy.carrental.model.data.dataProvider;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Q: this is the main entry point of our program. What should we do here?
        Shop shop = new Shop();
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to our shop!");
        System.out.println("What's your usename?");
        String username = sc.nextLine();

        System.out.println("What's your password?");
        String password = sc.nextLine();

        Salesman user =shop.login(username,password);
        if(user != null) {
            shop.showMenu();
            System.out.println("What would you like to do");
            String option = sc.nextLine();
            switch (option){
                case "1":
                    shop.listAllCars();
                    break;

                case "2":
                    break;

                case "3":
                    break;

                case "4":
                    break;

                case "5":
                    System.out.println("You have logged out! \n What's your username?");
                    username = sc.nextLine();
                    System.out.println("What your passowrd?");
                    password = sc.nextLine();
                    user = shop.login(username,password);
                    break;

                case "6":
                    shop.logout(user);
                    break;
            }
        }


    }
}
