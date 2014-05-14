// EXT:LONG
class Array {
    public static void main(String[] args) {
		int[] x;
		int y;
        long i;

        x = new int[10];
        i = 1;
        x[1 + i] = 3; // should fail 
    }
}
