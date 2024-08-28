
import java.util.Scanner;

public class Tut4q5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] studentNames = new String[5];
        double[][] marks = new double[5][3];
        for(int i=0;i<=studentNames.length;i++){
            System.out.println("Enter student name");
            studentNames[i]=s.next();
            for(int j=1;j<marks.length;j++){
                System.out.println("Enter marks for subject : " + (j) + ":");
                marks[i][j] = s.nextDouble();
            }
        }
        for(double[] m:marks){
            System.out.println(m);
        }
    }
    
}
