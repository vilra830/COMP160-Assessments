public class BookApp{
  public static void main(String[]args){
    Book book1 = new Book();
    book1.setTitle("Life of Pi");
    book1.setPages(348);
    book1.setPrice(28.90);
    book1.displayBook();
    
        
    Book book2 = new Book();
    book2.setTitle("Mister Pip");
    book2.setPages(240);
    book2.setPrice(22.70);
    book2.displayBook();
    
    Book book3 = new Book();
    book3.setTitle("The Shack");
    book3.setPages(500);
    book3.setPrice(25.70);
    book3.displayBook();
  }
}
