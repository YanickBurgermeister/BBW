public class test {
    public static void main(String[] args) {
        int a = 60;
        int b = 13;
        int c;
        System.out.println("Binäre Operationen");
        System.out.println("--------------------");
        System.out.println();
        c = a & b;
        System.out.println("c=a&b");
        System.out.println("a= " + Integer.toBinaryString(a));
        System.out.println("b= " + Integer.toBinaryString(b));
        System.out.println("c= " + Integer.toBinaryString(c) + " " + c);
        System.out.println();
        c = a | b;
        System.out.println("c=a|b");
        System.out.println("a= " + Integer.toBinaryString(a));
        System.out.println("b= " + Integer.toBinaryString(b));
        System.out.println("c= " + Integer.toBinaryString(c) + " " + c);
        System.out.println();
        c = ~a;
        System.out.println("c=~a");
        System.out.println("a= " + Integer.toBinaryString(a));
        System.out.println("b= " + Integer.toBinaryString(b));
        System.out.println("c= " + Integer.toBinaryString(c) + " " + c);
        System.out.println();
        c = a << 2;
        System.out.println("c=a|b");
        System.out.println("a= " + Integer.toBinaryString(a));
        System.out.println("b= " + Integer.toBinaryString(b));
        System.out.println("c= " + Integer.toBinaryString(c) + " " + c);
        System.out.println();
        c = a >> 15;
        System.out.println("a >> 15");
        System.out.println("a= " + Integer.toBinaryString(a));
        System.out.println("b= " + Integer.toBinaryString(b));
        System.out.println("c= " + Integer.toBinaryString(c) + " " + c);
        System.out.println();
    }
}
