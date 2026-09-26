class DynamicArray {
    int[] arr;
    int size=0;
    int capacity;

    public DynamicArray(int capacity) {
        this.arr=new int[capacity];
        this.capacity=capacity;
    }

    public int get(int i) {
        return arr[i];
    }

    public void set(int i, int n) {
        arr[i]=n;
    }

    public void pushback(int n) {
        if(size==capacity){
            resize();
        }
        arr[size]=n;
        size+=1;
        
    }

    public int popback() {
        size=size-1;
        return arr[size];
    }

    private void resize() {
        int[] temp=arr;
        capacity=(capacity==0)?1:capacity*2;
        arr=new int[capacity];
        for(int i=0;i<size;i++){
            arr[i]=temp[i];
        }
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }
}
