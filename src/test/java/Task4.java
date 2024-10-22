public class Task4 {
    public void greet(){
        System.out.println("Hello!");
    }
    public void greet(String name){
        System.out.println("Hello, " + name + "!");
    }

    public static void main(String[] args) {
        Task4 greeting = new Task4();
        greeting.greet();
        greeting.greet("Alice");
    }
}
