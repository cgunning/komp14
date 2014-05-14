package se.cgunning.java.programs;

//EXT:CEQ
//EXT:NEQ
//EXT:BDJ
class BooleanTrouble {
    public static void main(String[] s) {
        boolean isTrue;
        int fem;
        int fyra;

        isTrue = true;
        fem = 5;
        fyra = 4;

        if(fem > fyra && isTrue) {
            System.out.println("HAHAHA");
        }
    }
}

class TroubleMaker2 {

    public int test(int k) {
        if(k > 1 || k < 7)
            System.out.println("HEJ");

        return 24;
    }
}
