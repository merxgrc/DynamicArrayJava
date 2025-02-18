class DynamicArray {

    // This is where the instances variables go 
    private int[] arr;
    private int length;
    private int capacity;

    // This is the constructor 
    public DynamicArray(int capacity) {
        this.capacity = capacity; // setting the initial capacity of the array
        this.length = 0; // array starts empty, so lenght = 0
        this.arr = new int[this.capacity]; // Creating a new integer array for the given capacity so we can resize it dynamically
    }

    // return the value at the i-th index
    public int get(int i) {
        return arr[i];
    }

    // insert the value n at the i-th index
    public void set(int i, int n) {
        arr[i] = n;
    }

    // insert n in the last position of the array
    public void pushback(int n) {
        // if the array is full resize
        if (length == capacity) {
            resize();
        }

        // insert n in the last position
        arr[length] = n;
        length++; // make length one longer since we add a new element.
    }
    
    // remove the last element in the array and returns new last element
    public int popback() {
        if (length > 0) {
            length--;
        }
        return arr[length];
    }

    // increase the capacity
    private void resize() {
        capacity *= 2; // double capacity
        int[] newArr = new int[capacity]; // initializing a newArr with the updated capacity
        
        // copy the content of arr in newArr
        for (int i = 0; i < length; i++) {
            newArr[i] = arr[i];
        }

        arr = newArr; // make arr point to the new array 
    }

    public int getSize() {
        return length;
    }

    public int getCapacity() {
        return capacity;
    }
}

