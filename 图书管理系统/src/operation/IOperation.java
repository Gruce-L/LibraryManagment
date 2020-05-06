package operation;

import book.BookList;

public interface IOperation {

    //默认方法是public static，所以不用写
    void work(BookList bookList);
}
