//package P_30_03;
//
//import P_05_03.Musor;
//import org.junit.Test;
//
//import static org.junit.Assert.assertEquals;
//
//public class C_test {
//    Calc c = new Calc();
//    public String str = "5+5";
//    @Test
//    public void testCompile(){
//        c.compile(str.toCharArray());
//        assertEquals("fail",10 , c.compile(str.toCharArray()));
//    }
//    @Test
//    public void testCompile1(){
//        assertEquals("fail",7 , c.compile("2+5".toCharArray()));
//    }
//
//    @Test
//    public void testCompile2(){
//        assertEquals("fail",10 , c.compile("4+6".toCharArray()));
//    }
//
//    @Test
//    public void testCompile3(){
//        assertEquals("fail",10 , c.compile("3+7".toCharArray()));
//    }
//
//    @Test
//    public void testCompile4(){
//        assertEquals("fail",10 , c.compile("2+8".toCharArray()));
//    }
//
//    @Test
//    public void testCompile5(){
//        assertEquals("fail",10 , c.compile("1+9".toCharArray()));
//    }
//
//    @Test
//    public void testCompile6(){
//        assertEquals("fail",0 , c.compile("1-1".toCharArray()));
//    }
//
//    @Test
//    public void testCompile7(){
//        assertEquals("fail",10 , c.compile("5*2".toCharArray()));
//    }
//
//    @Test
//    public void testNO(){
//        assertEquals("fail",2, c.nextOther('2'));
//    }
//
//    @Test
//    public void testNO1(){
//        assertEquals("fail",2, c.nextOther('2'));
//    }
//    @Test
//    public void testNO2(){
//        assertEquals("fail",0, c.nextOther('0'));
//    }
//    @Test
//    public void testNO3(){
//        assertEquals("fail",5, c.nextOther((char) c.compile("3+2".toCharArray())));
//    }
//    @Test
//    public void testNO4(){
//        assertEquals("fail",2, c.nextOther('2'));
//    }
//
//
////    @Test
////    public void test(){
////        assertEquals("fail",5, c.nextOther('5'));
////    }
//}
