import java.util.Scanner;

public class Tut4q3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double[] array = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8, 9.9, 10.0};
        System.out.println("Enter swap number 1 index : ");
        int num1 = s.nextInt();
        System.out.println("Enter swap number 2 index : ");
        int num2 = s.nextInt();
        if(num1<=10){
            if(num2<=10){
                double temp = array[num1-1];
                array[num1-1]=array[num2-1];
                array[num2-1]=temp;
                for(int i=0;i<=array.length;i++){
                    System.out.println(array[i]);
                } 
                s.close();
            }else{
                System.out.println("Error.");
            }
        }else{
            System.out.println("Error.");
        }
    } 
}
