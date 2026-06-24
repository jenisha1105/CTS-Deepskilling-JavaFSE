public class SingletonPattern {

    // Step 1: Create a static reference variable
    private static SingletonPattern instance;

    // Step 2: Make constructor private
    private SingletonPattern() {
        System.out.println("Singleton Object Created");
    }

    // Step 3: Provide public method to access object
    public static SingletonPattern getInstance() {

        if (instance == null) {
            instance = new SingletonPattern();
        }

        return instance;
    }

  
    public void display() {
        System.out.println("Singleton Pattern Successfully Implemented");
    }

    public static void main(String[] args) {

        SingletonPattern obj1 =
                SingletonPattern.getInstance();

        SingletonPattern obj2 =
                SingletonPattern.getInstance();

        obj1.display();

        System.out.println("Are both objects same? "
                + (obj1 == obj2));
    }
}
