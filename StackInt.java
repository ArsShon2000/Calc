package P_30_03;

//Непрерывная реализация стека целых чисел.
class StackInt{
    private static final int DEFSIZE = 16;
    private int[] array;
    private int head;
//    protected int _size = array.length;

    public StackInt(){
        array = new int[DEFSIZE];
        head = 0;
    }

    public final void push(int val){
        array[head++] = val;
    }

    public final int pop(){
        return array[--head];
    }

    public final int top(){
        return array[head - 1];
    }
}
