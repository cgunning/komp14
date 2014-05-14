

class nc2 { 
    public static void main(String[] args) { 
        Util util; 
        util = new Util(); 
  
        util.add(100, true); 
    } 
} 
  
class Util { 

    /*
    this should fail
    */
    public int add(int a, boolean b) { 
        int b; 
        b = 10; 
        return a + b; 
    } 
}