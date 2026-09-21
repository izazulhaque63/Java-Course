public class recursion{
    public static void showNumber(int num){
        if (num == 0){
            return ;
        }
        System.out.println("num");
        showNumber(num - 1);
    }
    public void main(String[] args) {
        showNumber(5);
    }
}




