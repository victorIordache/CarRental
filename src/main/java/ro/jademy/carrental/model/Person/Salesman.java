package ro.jademy.carrental.model.Person;

import ro.jademy.carrental.model.Person.Person;

public class Salesman extends Person {

    public int id;
    private String username;
    private String password;

    public Salesman(String firstName, String lastName, String CNP, int id, String username, String password) {
        super(firstName, lastName, CNP);
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
