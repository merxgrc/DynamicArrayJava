public class Main {
    public static void main(String[] args) {
        DynamicArray myArray = new DynamicArray(1);

        System.out.println("Element at index 0: " + myArray.get(0));

        myArray.set(0, 1);
        System.out.println("Now element at index 0: " + myArray.get(0));
    }
}