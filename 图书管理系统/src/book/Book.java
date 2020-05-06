package book;

public class Book {
    private String name;            //书名
    private String author;         //作者
    private int price;              //价格
    private String type;            //属的类型
    private boolean isBorrorwed = false;    //是否被借出,默认为未借出

    //外部调用此方法进行书籍属性填充
    public Book(String name, String author, int price, String type) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isBorrorwed() {
        return isBorrorwed;
    }

    public void setBorrorwed(boolean borrorwed) {
        isBorrorwed = borrorwed;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", type='" + type + '\'' +
                ", isBorrorwed=" + isBorrorwed +
                '}';
    }
}
