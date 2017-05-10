public class BookStore {
  public static void main(String[] args) {

    Book BL = new Book("Black line ", "Christoff ",  150);
    Book BL1 = new Book("Black line ", "Makswell ",  150);
    Book Lontano = new Book("Lontano ", "Grange ", "Jan ", 150);
    System.out.println(BL.equals(Lontano));   System.out.println("\t1 comparison only by price");
    System.out.println(BL.equals1(Lontano));  System.out.println("\t2 comparison by price and title");
    System.out.println(BL.equals1(BL1));  System.out.println("\t2 comparison by price and title");
    System.out.println(BL.equals(BL));   System.out.println("\t3 comparison to itself");
    System.out.println(BL == BL);        System.out.println("\t4 simple comparison");

    Author Jan = new Author("JanKristoff", "football");
    Author Jak = new Author("JakShirak");
    System.out.println(Jan.equals(Jak));
    System.out.println(Jan.equals(Jan)); System.out.println();

    System.out.println(" // using toString for Book");
    System.out.println(Book.toStringCanBeenNamedAsYouWant(Lontano));
    System.out.println(Book.toStringCanBeenNamedAsYouWant(BL));  System.out.println();
    System.out.println(" // using toString for Author");
    System.out.println(Author.toString(Jan));
    System.out.println(Author.toString(Jak));
  } // main
} /// java
class Book {
  String title;
  String author1;
  String author2;
  int price;

  Book (String t, String a1, int p) { // constructor
    title = t;
    price = p;
    author1 = a1;
  }
  Book (String t, String a1, String a2, int p) { // constructor
    title = t;
    author1 = a1;
    author2 = a2;
    price = p;
  }

  boolean equals1 (Book that) {
    return price == that.price && title == that.title;
  }
  boolean equals (Book that) {
    // if (this == that) return  true;
    return price == that.price;
  }

  public static String toStringCanBeenNamedAsYouWant(Book book) {
    String str;
    if (book.author2 != null) {
      str = (book.title + " author1 " + book.author1 + " author2 " + book.author2 + book.price);
    } else {
      str = (book.title + " author1 " +book.author1 + book.price);
    }
    return  str;
  }
} // book

class Author {
  String name;
  String hobbi;

  Author (String n) {
    name = n;
  }
  Author (String n, String h) {
    name = n;
    hobbi = h;
  }

  boolean equals (Author that) {
    // if (this == that) return  true;
    return name == that.name;
  }

  public static String toString(Author author) {
    String str;
    if (author.hobbi != null) {
      str = (author.name + " hobbi " + author.hobbi);
    } else {
      str = (author.name);
    }
    return  str;
  }
} // Author
