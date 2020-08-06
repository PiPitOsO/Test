public class Main {
    public static int numberOfWords(String a) {
        String[] b;
        b = a.split(" ");
        return b.length;
    }
    public static int length(String a) {
        return a.length();
    }
    public static String del(String a){
        return a.replaceAll("[,.!? ]", "");
    }
}