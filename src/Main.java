public class Main {
    public static void main(String[] args) {

Author author1 = new Author( " Генри Райдер"," Хаггард");
Author author2 = new Author( " Name2"," Surname2");


Book book1 = new Book("Дочь Монтесумы", 1956, author1 );
Book book2 = new Book("Title2", 2022, author2);
System.out.println(" Автор: " + author1.getFullName());
System.out.println(" Автор: " + author2.getFullName());
        System.out.println(author1);
        System.out.println(author2);



        System.out.println(" Название книги: " + book1.getName() + ", год издания книги: " + book1.getYear() + ", автор книги: " + book1.getAuthor().getFullName());
        System.out.println(" Название книги: " + book2.getName() + ", год издания книги: " + book2.getYear() + ", автор книги: " + book2.getAuthor().getFullName());
        System.out.println(book1);
        System.out.println(book2);

    }
}