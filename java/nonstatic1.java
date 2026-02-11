class nonstatic1{
    public void test(){
        System.out.println("this is non static met");
    }
    public static void main(String[] args) {
        nonstatic1 a1=new nonstatic1();
        a1.test();
    }

} 