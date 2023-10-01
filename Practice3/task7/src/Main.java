// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
            Reader Kate = new Reader();
            String[] books = new String[] {"Tales", "How to cope with stress", "Introduction into Math"}; //список книг
            /*takebook с перегрузками*/
            Kate.takebook();
            Kate.takebook(3);
            Kate.takebook(books);
            /*returnbook с перегрузками*/
            Kate.returnbook();
            Kate.returnbook(3);
            Kate.returnbook(books);
        }
    }
