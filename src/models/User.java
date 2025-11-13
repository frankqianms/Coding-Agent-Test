/**
 * User.java
 * 
 * This file is located in a subdirectory (src/models/) to demonstrate
 * how comments can be added to files within nested folder structures.
 * 
 * Purpose: User model class representing a user entity
 * Location: src/models/User.java
 * 
 * @author Coding Agent Test
 * @version 1.0
 */

public class User {
    // User properties with inline comments
    private String name;    // User's full name
    private int age;        // User's age in years
    private String email;   // User's email address
    
    /**
     * Constructor to create a new User
     * 
     * @param name User's name
     * @param age User's age
     * @param email User's email
     */
    public User(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }
    
    /**
     * Gets the user's name
     * 
     * @return User's name
     */
    public String getName() {
        return name;
    }
    
    /**
     * Gets the user's age
     * 
     * @return User's age
     */
    public int getAge() {
        return age;
    }
    
    /**
     * Gets the user's email
     * 
     * @return User's email address
     */
    public String getEmail() {
        return email;
    }
}
