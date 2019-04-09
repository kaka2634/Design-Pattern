package proxy.Impl;

import proxy.IBookParser;

public class BookParser implements IBookParser {
    private String book;
    private int pageNumber;
    public BookParser(String book){
        //expensive parser
        this.book = book;
        pageNumber = this.book.length();
    }

    @Override
    public int getPageNumber() {
        return pageNumber;
    }
}
