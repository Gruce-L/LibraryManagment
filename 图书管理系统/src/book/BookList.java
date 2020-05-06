package book;

public class BookList {
    private Book[] books = new Book[100];
    private int usedSize = 0;

    public BookList(){
        books[0] = new Book("剑指offer", "电子工业出版社", 35, "编程类");
        books[1] = new Book("数据结构与算法分析", "机械工业出版社", 69,"编程类");
        books[2] = new Book("月亮与六便士","上海译文出版社",39,"小说");
        this.usedSize = 3;
    }

    //我们可以把所有的操作都可以写到这个类当中，因为每个操作都是操作books数组

    public int getUsedSize() {
        return usedSize;
    }

    public void setUsedSize(int usedSize) {
        this.usedSize = usedSize;
    }

    public void setBooks(int pos, Book book){
        this.books[pos] = book;
    }

    public Book getBook(int pos){
        return this.books[pos];
    }
}
