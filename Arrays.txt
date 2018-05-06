public class Arrays {
    public static void main(String[] args) {
        int arrayOfFirstInts[] = new int[3];

        arrayOfFirstInts[0] = 10;
        arrayOfFirstInts[1] = 100;
        arrayOfFirstInts[2] = 1000;

        int arrayOfSecondInts[] = new int[3];

        arrayOfSecondInts[0] = 5;
        arrayOfSecondInts[1] = 15;
        arrayOfSecondInts[2] = 20;

        System.out.println(arrayOfFirstInts[0]);
        System.out.println(arrayOfFirstInts[1]);
        System.out.println(arrayOfFirstInts[2]);

        System.out.println(arrayOfSecondInts[0]);
        System.out.println(arrayOfSecondInts[1]);
        System.out.println(arrayOfSecondInts[2]);

        System.out.print("Sum of all int values: ");
        System.out.println(arrayOfFirstInts[0] + arrayOfFirstInts[1] + arrayOfFirstInts[2] +
                arrayOfSecondInts[0] + arrayOfSecondInts[1] + arrayOfSecondInts[2]);

    }
}
