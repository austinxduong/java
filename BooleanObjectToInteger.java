public class BooleanObjectToInteger {
    public static int BooleanObjInt(boolean foo) {
        return Boolean.compare(foo, true);
    }
    public static void main(String[] args) {
        boolean foo = false;
        System.out.println(BooleanObjInt(foo));
    }
}

// 0 if "paramOne" is equal to "paramTwo" // 0
// negative value if "paramOne" is false, and "paramTwo" is true; // -1
// poistive value if "paramOne" is true, and "paramTwo" is false; // 1
