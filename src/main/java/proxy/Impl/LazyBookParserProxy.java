package proxy.Impl;

import proxy.IBookParser;

public class LazyBookParserProxy implements IBookParser {
    private BookParser bookParser = null;
    private String book = null;

    public LazyBookParserProxy(String book){
        this.book = book;
    }

    @Override
    public int getPageNumber() {
        //lazy evaluation
        if(this.bookParser == null){
            this.bookParser = new BookParser(this.book);
        }
        return this.bookParser.getPageNumber();
    }
}
