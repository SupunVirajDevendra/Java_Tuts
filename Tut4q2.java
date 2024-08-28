public class Tut4q2 {
    public static void main(String[] args) {
        String[] array = {"Alex","Max","Charlie","Bob","Ada","Jim"};
        String temp = array[2];
        array[2]=array[4];
        array[4]= temp;
        for(int i=0;i<=array.length;i++){
            System.out.println(array[i]);
        }
    }
    
}
