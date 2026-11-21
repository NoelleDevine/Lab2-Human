public class Main {
    public static void main(String[] args) {
        // Create a new Human instance
        Human person = new Human("John Doe", 30, "Buddhist");
        Human person2 = new Human("Jane Doe", 28, true);

        // Using the getter methods
        System.out.println("Name: " + person.getName() + ", Age: " + person.getAge() + ", Religion: " + person.getReligion());
        System.out.println("Name: " + person2.getName() + ", Age: " + person2.getAge() + ", Healthy: " + person2.isHealthy());

        person.setName("Jane Doe");
        person.setAge(28);

        // Invoking the custom method
        person.talk("Hello, world!");
    }
}
