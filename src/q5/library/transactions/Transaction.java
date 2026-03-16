package q5.library.transactions;

import q5.library.books.Book;
import q5.library.members.Member;

public class Transaction {

    public void issue(Book b, Member m){

        System.out.println(m.getName() + " issued " + b.getTitle());

    }
}