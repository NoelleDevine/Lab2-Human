public class Human {
    // Data members
    private String name;
    private int age;
    private boolean healthy;
    private String religion; 
    
    // Basic constructor
    public Human(String name, int age, String religion) {
        this.name = name;
        this.age = age;
        this.religion = religion;

    }
    public Human(String name, int age , boolean healthy) {
        this.name = name;
        this.age = age;
        this.healthy = healthy;
        this.religion = "Unknown"; // Default religion to "Unknown"
    }
    
    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getReligion() {
        return religion;
    }

    public boolean isHealthy() {
        return healthy;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = (age > 0) ? age : 1; // Ensure the age is positive
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public void setHealthy(boolean healthy) {
        this.healthy = healthy;
    }

    // Custom method
    public void talk(String message) {
        System.out.println(name + " says: " + message);
    }
}
