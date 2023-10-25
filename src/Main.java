public class Main {
    public static void main(String[] args) {
        int[] arr1 = new int[10];

        int size = 5;
        int[] arr2 = new int[size];

        int[] arr = {1, 4, 6, 3, 7};

        double[] arrDouble = new double[5];
        String[] arrStr = new String[6];
        char[] arrChar = new char[7];
        boolean[] arrBool = new boolean[2];

        int[] a = {5, 8, 6, 9, 4, 10, 19, 20, 18, 40};
        a[4] = 45;
        System.out.println("5th element: "+a[4]);
        //System.out.println("100th element: " + a[100]);

        for( int i = 0; i<a.length; i++){
            System.out.println("Element "+ i + " " + a[i]);
        }
        System.out.println("-------------");
        int j = 0;
        while (j<a.length) {
            System.out.println("Element "+ j + " " + a[j]);
            j++;
        }
        System.out.println("-------------");
        for (var items : a) System.out.println(items);

    }
}
