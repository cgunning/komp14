// EXT:LONG
// EXT:IWE

class e1 {
    public static void main(String[] args) {
        ArrayList list;
        list = new ArrayList();

        list.init();

        list.add(10L);
        list.add(100L);
        list.add(23L);
        list.add(235L);
        list.add(653423l);
        list.add(5435l);
        list.add(6435L);

        list.remove(2);

        list.print();
    }
}


class ArrayList {
    long[] list;

    public boolean init() {
        list = new long[0];
        return true;
    }

    public boolean add(long e) {
        long[] newList;
        int i;

        newList = new long[list.length + 1];

        for (i = 0; i < list.length; i = i+1) {
            newList[i] = list[i];
        }
        newList[i] = e;
        list = newList;
        return true;
    }

    public long get(int i) {
        return list[i];
    }

    public boolean remove(int index) {
        long[] newList;
        int i;
        int offset;

        offset = 0;

        newList = new long[list.length - 1];

        for (i = 0; i < list.length; i = i+1) {
            if(i != index) {
                newList[i - offset] = list[i];
            } else {
                offset = offset + 1;
            }
        }

        list = newList;
        return true;
    }

    public boolean print() {
        int i;

        System.out.println(list.length);
        for(i = 0; i < list.length; i = i + 1) {
            System.out.println(list[i]);
        }
        return true;
    }
}