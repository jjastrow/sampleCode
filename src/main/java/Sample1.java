public class Sample1 {
    String str = "test str";

    public static void main(String[] args) {
        Sample1 sample1 = new Sample1();
        System.out.println(sample1.makeFirst(sample1.str));
        System.out.println(sample1.makeSecond(sample1.str));
    }

    String makeSecond(String str) {
        return "SECOND: " + str;
    }

    String makeFirst(String str) {
        return "FIRST: " + str;
    }
}
