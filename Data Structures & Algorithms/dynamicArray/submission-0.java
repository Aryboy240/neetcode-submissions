class DynamicArray {

    int size;
    int capacity;
    int[] array;

    public DynamicArray(int capacity) {
        this.size = 0;
        this.capacity = capacity;
        this.array = new int[capacity];
    }

    public int get(int i) {
        return array[i];
    }

    public void set(int i, int n) {
        array[i] = n;
    }

    public void pushback(int n) {
        if (size == capacity){
            resize();
        }
        array[size++] = n;
    }

    public int popback() {
        if (size > 0){
            return array[--size];
        }
        else {
            return -1;
        }
    }

    private void resize() {
        capacity *= 2;
        int[] doubleSize = new int[capacity];
        for (int i = 0; i < size; i++){
            doubleSize[i] = array[i];
        }
        array = doubleSize;
    }

    public int getSize() {
        return this.size;
    }

    public int getCapacity() {
        return this.capacity;
    }
}
