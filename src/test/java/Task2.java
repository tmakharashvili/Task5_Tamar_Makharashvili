public class Task2 {
    public static void main(String[] args) {
        int largest = findLargest (5, 12, 9);
    //    System.out.println(largest);
    }
    public static int findLargest (int a, int b, int c){
        return Math.max(Math.max(a,b),c);
    }
}
