public class challange75 {
    public static void main(String[] args) {
        String[] arr = new String[] { "this", "is", "the", "best", "java", "programing"};
        StringBuilder sb = new StringBuilder();
        for (String str : arr){
            sb.append(str).append(" ");
        }
        System.out.println(sb);
    }
}
