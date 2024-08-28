import java.util.Scanner;

    public class tut4q1 {
        public static void main(String[] args){
            int f=0;
            int mark=0;
            Scanner s = new Scanner(System.in);
            int[] num = new int[6];
            for(int i = 0; i<6; i++){
                System.out.println("Enter the number : ");
                num[i]=s.nextInt();
            }
            System.out.println(" ");
            for(int num1:num){
                System.out.println(num1);
                mark+=num1;
                if(num1<=40){
                    f++;
                }
            }
            System.out.println(" ");
            System.out.println("1. "+ f + " student fail the exam.");
            double fail_avg = (double)f/6*100;
            System.out.println("2. students failed average is " + fail_avg + "%");
            double avg = mark/6;
            System.out.println("3. Average mark is " + avg); 
            s.close();
        }

    }
