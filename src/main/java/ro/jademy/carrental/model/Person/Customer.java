package ro.jademy.carrental.model.Person;

import ro.jademy.carrental.model.Cars.RentedCarHistoryItem;

import java.util.ArrayList;
import java.util.List;

public class Customer extends Person {

    private List<RentedCarHistoryItem> rentedCarHistoryItemHistory = new ArrayList<>();

    public Customer(String firstName, String lastName, String CNP) {
        super(firstName, lastName, CNP);
    }

    public RentedCarHistoryItem getCurrentRentedCar(){
        for(RentedCarHistoryItem item : rentedCarHistoryItemHistory){
            if(item.isCurrentlyRented()){
                return item;
            }
        }
        return null;
    }

}
