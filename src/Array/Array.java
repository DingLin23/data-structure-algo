public class Array{
    private int[] data;
    private int size;

    // 构造函数，传入数组的容量capacity构造array
    public Array(int capacity){
        data = new int [capacity];
        size = 0;
    }

    //无参数的构造函数，默认数组的容量capacity=10
    public Array() {
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

    @Override //覆盖父类的一个方法，因为当如果我们toString打错的时候会提示
    public String toString(){
        StringBuilder res = new StringBuilder();
        res.append(String.format("Array: size = %d, capacity = %d\n", size,data.length));//%d和%f分别用来表示输出时，替换整型输出和浮点型输出的占位符.\n是回车字符
        res.append('[');
        for(int i = 0; i < size; i++){
            res.append(data[i]);
            if(i != size-1) res.append(", ");
        }
        res.append(']');
        return res.toString();
    }
}