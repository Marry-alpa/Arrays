import java.util.Arrays;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Handling {
    public static void main(String[] args) {
        boolean askFofRep = true;
        char cont;
        do {
            if (askFofRep){
                cont = 'y';
                askFofRep = false;
            }else{
                Scanner s2 = new Scanner(System.in);
                System.out.println("Do you want to continue? (y/n)");
                cont = s2.next().charAt(0);
            }
            if (Objects.equals(cont, 'y')){
                System.out.println("Do you want enter your own array or random? (choose 1 or 2)");
                System.out.println("1 = your own, 2 = random");
                Scanner c = new Scanner(System.in);
                int ch = c.nextInt();
                if (ch == 2) {
                    Random rd = new Random();
                    System.out.println("Enter the size: ");
                    Scanner s = new Scanner(System.in);
                    int n = s.nextInt();
                    int[] arr = new int[n];
                    System.out.println("Created array");
                    int i;
                    for (i = 0; i < arr.length; i++) {
                        arr[i] = rd.nextInt(100);
                        System.out.println(arr[i] + " ");
                    }
                    int sum = Arrays.stream(arr).sum();
                    System.out.println("Sum: " + sum);
                    int max = 0;
                    for ( i = 0; i< arr.length; i++){
                        if (arr[i]>max){
                            max = arr[i];
                        }
                    }
                    System.out.println("Maximum: " + max);
                    System.out.println("look for number? (enter the number)");
                    int look = s.nextInt();
                    found(arr, look);
                }

                if (ch == 1) {

                    System.out.println("Enter the size: ");
                    Scanner s1 = new Scanner(System.in);
                    int size = s1.nextInt();
                    int arr[] = new int[size];
                    System.out.println(" ");
                    System.out.println("Enter the elements: ");
                    for (int i = 0; i < size; i++) {
                        arr[i] = s1.nextInt();
                    }
                    System.out.println("Your array");
                    for (int i = 0; i < size; i++) {
                        System.out.println(arr[i]);
                    }
                    int sum = Arrays.stream(arr).sum();
                    System.out.println("Sum: " + sum);

                    int max = 0;
                    for (int i = 0; i<size; i++){
                        if (arr[i]>max){
                            max = arr[i];
                        }
                    }
                    System.out.println("Maximum: " + max);
                    System.out.println("look for number? (enter the number)");
                    int look = s1.nextInt();
                    found(arr, look);
                }
            }

        }while (!Objects.equals(cont, 'n'));
    }

    private static void found(int[] arr, int look) {
        for (int i = 0; i< arr.length-1; i++){
            if (arr[i]==look){
                System.out.println("You found your element. It's number: " + i);
            }else{
                System.out.println("Not found");
            }
        }
    }
}

