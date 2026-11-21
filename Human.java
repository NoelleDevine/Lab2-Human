public class Human {
    // Data members
    private String name;
    private int age;
    private String sleep;
    
    // Basic constructor
    public Human(String name, int age, String sleep) {
        this.name = name;
        this.age = age;
        this.sleep = sleep;
    }
    
    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSleep(){
        return sleep;
    }
    
    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = (age > 0) ? age : 1; // Ensure the age is positive
    }

    public void setSleep(String sleep) {
        this.sleep = sleep;
    }
    
    // Custom method
    public void talk(String message) {
        System.out.println(name + " says: " + message);
        System.out.println("person is " + sleep);
    }
}
