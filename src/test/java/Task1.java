public class Task1 {
    public static boolean isEven(int number){
        return (number-(number/2)*2)==0;
    }

    public static void main(String[] args) {
        System.out.println(isEven(4));
        System.out.println(isEven(7));
    }
}
