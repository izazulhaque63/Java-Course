public class book {
        static int TotalNumberOfbooks;
        String title;
        String author;
        String isbn;
        boolean isborowed;

        //  public static void getTotalBook(){}
//    public void borowBook(){}
//    public void returnBook(){}

        static {
            TotalNumberOfbooks = 0;
        }
        {
            TotalNumberOfbooks++;
        }
        book(String isbn, String title, String author) {
            this.isbn = isbn;
            this.author = author;
            this.title = title;
        }
        book(String isbn){
            this(isbn, "unknown", "unknown");
        }
        static int getTotalNumberofBook(){
            return TotalNumberOfbooks;
        }
        void borowBook(){
            if (isborowed){
                System.out.println("book is already borrowed");
            }else {
                this.isborowed = true;
                System.out.println("enjoy borrowed book");
            }
        }
        void returnBook(){
            if (isborowed){
                System.out.println("hope you enjoyed, please leave a reviw");
            }else {
                System.out.println("this book already in the libary");
            }
        }

        public static void main(String[] args) {
            book myBook = new book("2");
            book designOfThing = new book("1","design","author");
            System.out.println(book.getTotalNumberofBook());
            designOfThing.borowBook();
            myBook.borowBook();
            designOfThing.returnBook();
            designOfThing.returnBook();
        }
    }


