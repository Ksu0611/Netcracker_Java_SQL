class Reader {
    private String FullName;
    private int library_card;
    private String faculty;
    private String BirthDate;
    private int PhoneNum;
    Reader(){
        FullName = "Kate Brown";
        library_card = 11;
        faculty = "RT";
        BirthDate = "01.01.2000";
        PhoneNum = 77777777;
    }

    /*Метод takebook*/
    /*---------------------------------------------------------*/
    public void takebook() {
        System.out.println(this.FullName + " took a book");
    }
    /*---------------------------------------------------------*/
    /*Перегрузка takebook с колвом книг*/
    /*---------------------------------------------------------*/
    public void takebook(int amount) {
        System.out.println(this.FullName + " took " + amount + " books");
    }
    /*---------------------------------------------------------*/
    /*Перегрузка takebook с списком книг*/
    /*---------------------------------------------------------*/
    public void takebook(String[] books) {
        System.out.print(this.FullName + " took " + books.length + " books: ");
        for (int i = 0; i < books.length; i++){
            System.out.print(books[i] + ", ");
        }
        System.out.println();
    }
    /*---------------------------------------------------------*/
    /*Метод returnbook*/
    /*---------------------------------------------------------*/
    public void returnbook() {
        System.out.println(this.FullName + " returned a book");
    }
    /*---------------------------------------------------------*/
    /*Перегрузка returnbook с колвом книг*/
    /*---------------------------------------------------------*/
    public void returnbook(int amount) {
        System.out.println(this.FullName + " returned " + amount + " books");
    }
    /*---------------------------------------------------------*/
    /*Перегрузка returnbook с списком книг*/
    /*---------------------------------------------------------*/
    public void returnbook(String[] books) {
        System.out.print(this.FullName + " returned " + books.length + " books: ");
        for (int i = 0; i < books.length; i++){
            System.out.print(books[i] + ", ");
        }
        System.out.println();
    }
    /*---------------------------------------------------------*/
}
