package Homework6;

public class Reader {
    String clientName;
    String readerTicketNumber;
    String faculty;
    String birthday;
    String phoneNumber;

    public Reader(String clientName, String readerTicketNumber, String faculty, String birthday, String phoneNumber) {
        this.clientName = clientName;
        this.readerTicketNumber = readerTicketNumber;
        this.faculty = faculty;
        this.birthday = birthday;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return clientName + " / " + readerTicketNumber + " / " + faculty + " / " + birthday + " / " + phoneNumber;
    }

    public void takeBook(int numberOfBooks) {
        System.out.println(clientName + " взял " + numberOfBooks + " книги.");
    }

    public void takeBook(String... booksList) {
        System.out.print(clientName + " взял книги: ");
        for (int i = 0; i < booksList.length - 1; i++) {
            System.out.print(booksList[i] + ", ");
        }
        System.out.println(booksList[booksList.length - 1] + ".");
    }

    public void takeBook(Book... books) {
        System.out.print(clientName + " взял книги: ");
        for (int i = 0; i < books.length - 1; i++) {
            System.out.print(books[i] + ", ");
        }
        System.out.println(books[books.length - 1] + ".");
    }

    public void returnBook(int numberOfBooks) {
        System.out.println(clientName + " вернул " + numberOfBooks + " книги.");
    }

    public void returnBook(String... booksList) {
        System.out.print(clientName + " вернул книги: ");
        for (int i = 0; i < booksList.length - 1; i++) {
            System.out.print(booksList[i] + ", ");
        }
        System.out.println(booksList[booksList.length - 1] + ".");
    }

    public void returnBook(Book... books) {
        System.out.print(clientName + " вернул книги: ");
        for (int i = 0; i < books.length - 1; i++) {
            System.out.print(books[i] + ", ");
        }
        System.out.println(books[books.length - 1] + ".");
    }

    public static void main(String[] args) {
        Reader client1 = new Reader("Петров В. В.", "MX-364257", "Философия", "12.12.1990", "+7-916-987-46-28");
        Reader client2 = new Reader("Иванов С. С.", "MX-347822", "История", "10.07.1992", "+7-903-698-13-13");
        Reader client3 = new Reader("Семёнов И. С.", "MX-364578", "Биология", "30.03.1992", "+7-903-369-78-16");
        Book book1 = new Book("Война и мир", "Толстой Л. Н.");
        Book book2 = new Book("Самая полная энциклопедия", "Клюшник Л. И.");
        Book book3 = new Book("Словарь Ушакова", "Ушаков Д. Н.");
        Reader[] clients = new Reader[] { client1, client2, client3 };
        Book[] books = new Book[] { book1, book2, book3 };
        for (Reader client : clients) {
            System.out.println(client);
        }
        for (Book book : books) {
            System.out.println(book);
        }
        client1.takeBook(3);
        client2.takeBook("Приключения", "Словарь", "Энциклопедия");
        client3.takeBook(book1, book2);
        client3.returnBook(2);
        client2.returnBook("Учебник Истории", "Словарь");
        client1.returnBook(book3);
    }
}
