public class HelloWorld {
    public static void main(String[] args) {
        String[] weeks = new String[7];

        for (int i = 0; i < 7; i++) {
            weeks[i] = "월";
            System.out.printf("%d", i);
        }
        System.out.println(weeks.length);
    }
}
