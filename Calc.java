package P_30_03;

//Калькулятор арифметических формул.
public class Calc extends Compf{
    public int t = 0;
    private StackInt s;
    String[] vosm = {"0","1","2","3","4","5","6","7","+","-","*","/"};
    private static int char2int(char c){
        return(int)c - (int)'0';
    }

    @Override
    protected int symOther(char c){
        if(c < '0' || c > '9'){
            System.out.println("Недопустимый символ: " + c);

            System.exit(0);
        }

        return SYM_OTHER;
    }

//    protected void tez(){
//        int second = s.pop();
//        int first = 0;
//            while (true){
//                first += s.pop();
//            }
//    }

//    protected int Plus(int A) {
////        if (A < 0) {
////            t += s.pop();
////            return Plus(A);
////        }
//        for(int i = 0; A > i; i++){
//            t += (s.pop() * (i * 10));
//        }
//
//        return t;
//    }

    @Override
    protected void nextOper(char c){
        int second = s.pop();
//        int first = Plus(s._size);
        int first = s.pop();


        switch(c){
            case '+':
                s.push(first + second);
                break;
            case '-':
                s.push(first - second);
                break;
            case '*':
                s.push(first*second);
                break;
            case'/':
                s.push(first/second);
                break;
        }
    }

    @Override
    protected int nextOther(char c){
        s.push(char2int(c));
        //s.push(Character.getNumericValue(c));
        return s.top();
    }

    public Calc(){
        s = new StackInt();
    }

//    public final int compile(char[] str){
//        int z = 0;
//        for (int i = 0; i < str.length; i++) {
//
//            String arr = String.valueOf(str[i]);
//            for (String q : vosm) {
//                if (arr.equals(q)) {
//                    System.out.println("+");
//                    z ++;
//                    if(str.length == z) super.compile(str);
//                }
//            }
//            if( 0 >= z - i ) {
//                System.out.println("Это не число в СС 8!, повторите ввод.");
//                return 0;
//            }
//
//        }
//        return s.top();
//
//    }

    public final void compile(char[] str){
//        proverka(str);
        super.compile(str);

//        System.out.println("ery" + s.top());
//        return s.top();
    }
}