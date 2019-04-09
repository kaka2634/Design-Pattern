package proxy;

import proxy.Impl.LazyBookParserProxy;

public class ProxyPatternExample {
    public static void main(String args[]){

        //Will not parse book (will not do expensive parser until call get method)
        LazyBookParserProxy proxy = new LazyBookParserProxy("sdfkaskdf");
        //Parser the book
        System.out.println(proxy.getPageNumber());
    }
}
