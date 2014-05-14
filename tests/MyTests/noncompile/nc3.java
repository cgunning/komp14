// EXT:NBD

class Main {
    public static void main(String[] args) {
        Nested n;
        n = new Nested();
        System.out.println(n.test());

    }
}

class Nested {
    public int test() {
        int a;
        a = 1;
        {
            int b;
            b = 2;
            {
                int c;
                c = 3;
                {
                    int d;
                    d = 4;
                    a = a + d;
                }

                // Should fail
                {
                    int e;
                    e = d;
                }
                a = a + c;
            }
            a = a + b;
        }
        return a;
    }
}