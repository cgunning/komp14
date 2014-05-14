// EXIT:ISC

class c1 {
    public static void main(String[] args) {
        System.out.println(new A().doIt());
    }
}

class A {
    int k;

    public int init() {
        k = 10;
        return k;
    }

    public int doIt() {
        return 10 + new B().doIt2().getK() + 100;
    }

    public int getK() {
        return k;
    }
}

class B extends A {

    public A doIt2() {
        B b;
        b = new B();
        b.init();
        return b;
    }
}
