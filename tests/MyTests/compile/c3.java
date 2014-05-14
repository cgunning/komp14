// EXT:IWE
// EXT:BDJ

class c3 {
    public static void main(String[] args) {
        Names name;
        name = new Names();
        System.out.println(name.name(true));
    }
}

class Names {
    int name;

    public boolean name(boolean name) {
        if(name || false && true) {
            name = true;
        } else {
            name = /* COMMENT!!!! */ false /* or true? */ || true;
        }
        return name;
    }
}

