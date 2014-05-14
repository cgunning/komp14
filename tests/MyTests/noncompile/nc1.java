// EXT:ISC

class nc1 {
    static void main(String[] args) {

    }
}

class A {
    public B doItA() {
        return new B().doItB();
    }
}

class B extends A {
    
    // Should fail
    public B doItB() {
        return new A();
    }
}