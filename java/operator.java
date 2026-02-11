class operator{
    public static void main(String[] args) {
        int a =37;
        int b =21;
        
        //arithmetic operators

        System.out.println("addition="+(a+b));
        System.out.println("sub="+(a-b));
        System.out.println("multiplication="+(a*b));
        System.out.println("division="+(a/b));
        System.out.println("modulus="+(a%b));

        //assignment operators
    
        a = b; 
        System.out.println("Simple Assignment: a = " + a); 

        
        a += b; 
        System.out.println("Addition Assignment: a = " + a); 

      
        a *= b; 
        System.out.println("Multiplication Assignment: a = " + a); 
        
        
        a /= b; 
        System.out.println("Division Assignment: a = " + a); 

           // Using unary operators
        System.out.println("Postincrement : " + (a++));
        System.out.println("Preincrement : " + (++a));

        System.out.println("Postdecrement : " + (b--));
        System.out.println("Predecrement : " + (--b));

        // Comparison operators
        int c = 5;

        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));
        System.out.println("a == c: " + (a == c));
        System.out.println("a != c: " + (a != c));


        // Logical operators
        boolean x = true;
        boolean y = false;
      
        System.out.println("x AND y: " + (x && y));
        System.out.println("x OR y: " + (x || y));
        System.out.println("NOT x: " + (!x));
    }
}

           
           

    