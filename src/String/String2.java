package String;

public class String2 {
    public static void main(String[] args) {
        String string = "java es facil";
        System.out.println(string.toUpperCase());
        System.out.println(string.replace("facil", "poderoso"));
        System.out.println(string.substring(0,4));
        StringBuilder sb = new StringBuilder();
        sb.append(string);
        System.out.println(sb.reverse());
    }
}