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

        System.out.println("Welcome to our shop! Would you like to login? [Y/N]");
        String response = sc.nextLine();
        switch(response){
            case "Y":
                System.out.println("What's your usename?");
                String username = sc.nextLine();
                System.out.println("What's your password?");
                String password = sc.nextLine();
                shop.login(username,password);
                break;
            case "N":
                System.out.println("Welcome client!");
                break;
        }
    }


}
