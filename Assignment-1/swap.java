public class main{
    public static void main(String[] args){
        int x = 100, y = 200;
        int temp = x;
        x = y;
        y = temp;

        System.out.println("After swap");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
