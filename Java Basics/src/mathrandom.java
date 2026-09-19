public class mathrandom {
    public static void main(String[] args) {
        System.out.println(Math.abs(-99));
        System.out.println(Math.ceil(5.07));
        System.out.println(Math.floor(5.07));
        System.out.println(Math.round(5.07));
        System.out.println(Math.random());
//        System.out.println(-99);
//        System.out.println(-99);
//        System.out.println(-99);
//        System.out.println(-99);


        for (int i = 0; i <= 10; i++){
            double random = Math.random() * 100;
            System.out.println(random);
        }
    }
}
