public class Names {
    public static void main(String[] args) {
        String myName = getMyName();
        System.out.println(myName);
        String MyFancyName = getMyFancyName("!!!");
        System.out.println(MyFancyName);
    }

    public static String getMyName()

    {
        return "Mark";
    }

    public static String getMyFancyName(String decoration) {
        String MyFancyName = decoration + " Mark" + decoration;
        return MyFancyName;


    }
}