class e2 {
    public static void main(String[] args) {
        Recursion rec;
        rec = new Recursion();

        System.out.println(rec.fac(1));
        System.out.println(rec.fac(2));
        System.out.println(rec.fac(3));
        System.out.println(rec.fac(4));
        System.out.println(rec.fac(5));
    }
}

class Recursion {

    public int fac(int n) {
        if(n == 1) {
            return 1;
        }
        return n * fac(n-1);
    }
}