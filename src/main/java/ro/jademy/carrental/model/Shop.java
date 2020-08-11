package ro.jademy.carrental.model;

import ro.jademy.carrental.model.Cars.Car;
import ro.jademy.carrental.model.Person.Customer;
import ro.jademy.carrental.model.Person.Salesman;
import ro.jademy.carrental.model.data.dataProvider;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    // Q: what fields and methods should this class contain?
    private List<Car> carList = new ArrayList<>();

    public Salesman login(String username, String password) {
        // Create a list that contains all salesmen
        // search through-out the list and if username & password is correct
        // login user
        // else
        // logout user
        ArrayList<Salesman> salesmenList = dataProvider.getSalesmanList();
        for(Salesman salesman : salesmenList){
            if(salesman.getUsername().equals(username) && salesman.getPassword().equals(password)) {
                System.out.println("Welcome " + salesman.getLastName() +" "+ salesman.getFirstName());
                Salesman currentuser = salesman;
                return currentuser;
            }
        }
        System.out.println("Failed to login!");
        return null;
    }

    public void showMenu() {

        System.out.println(" -----------------------------------------------");
        System.out.println("|    Welcome to the Jademy Car Rental Service   |");
        System.out.println(" -----------------------------------------------");
        System.out.println();
        System.out.println("                    MAIN MENU                   ");
        System.out.println("1. List all cars");
        System.out.println("2. List available cars");
        System.out.println("3. List rented cars");
        System.out.println("4. Check income");
        System.out.println("5. Logout");
        System.out.println("6. Exit");
    }

    public void showListMenuOptions() {

        System.out.println("Select an action from below:");
        System.out.println("1. Filter by make");
        System.out.println("2. Filter by model");
        System.out.println("3. Filter by budget");
        // TODO: add additional filter methods based on car specs

        System.out.println("4. Back to previous menu");

    }

    public void calculatePrice(int numberOfDays) {
        // TODO: apply a discount to the base price of a car based on the number of rental days
        // TODO: document the implemented discount algorithm

        // TODO: for a more difficult algorithm, change this method to include date intervals and take into account
        //       weekdays and national holidays in which the discount should be smaller

        // Q: what should be the return type of this method?
    }

    public void logout(Salesman salesman){
        System.out.println("Goodbye! See you soon.");
        salesman = null;
    }

    public void listAllCars() {
        for(Car car : carList){
            System.out.println();
        }
    }
}
