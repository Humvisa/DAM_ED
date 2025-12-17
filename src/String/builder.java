package String;

public class builder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 10; i++) {
            System.out.println(sb.append(i).append("-"));
        }
    }
}
