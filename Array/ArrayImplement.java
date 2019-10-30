public class ArrayImplement{
    private int[] data;
    private int size;

    // 构造函数，传入数组的容量capacity构造array
    public ArrayImplement(int capacity){
        data = new int [capacity];
        size = 0;
    }

    //无参数的构造函数，默认数组的容量capacity=10
    public Array(){
        this(10);
    }

    //获取数组中的元素个数
    public int getSize(){
        return size;
    }

    //获取数组中的容量
    public int getCapacity(){
        return data.length;
    }

    //返回数组是否为空
    public boolean isEmpty(){
        return size == 0;
    }

    //向所有元素后添加一个新元素
    public void addLast(int e){
        add(size,e);
        
    }

    //向所有数组元素前添加一个新元素
    public void addFirst(int e){
        add(0,e);
    }
    
    //在第index位置插入一个元素
    public void add(int index, int e){
        if(size == data.length){
            throw new IllegalArgumentException("AddLast fail, array is full");
        }
        if(index < 0 || index > size)  
            throw new IllegalArgumentException("Add fail, require index >= 0 and index <= size");
        // for(int j = size; j >=index; j--){
        //     data[j] = data[j--];
        // }
        for(int i = size -1; i>= index; i--){
            data[i+1] = data[i];
        }
        data[index] = e;
        size++;
    }
}