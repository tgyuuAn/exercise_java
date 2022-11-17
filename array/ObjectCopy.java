package array;

public class ObjectCopy {
    public static void main(String[] args){
        Book[] bookArray1 = new Book[3];
        Book[] bookArray2 = new Book[3];

        bookArray1[0] = new Book("태백산맥1","조정래");
        bookArray1[1] = new Book("태백산맥2","조정래");
        bookArray1[2] = new Book("태백산맥3","조정래");

        System.arraycopy(bookArray1,0,bookArray2,0,3);
        //주소가 복사 된 것 shallow copy가 됨.
        //깊은 복사를 하기 위해선 bookArray2도 객체를 따로 생성 해줘야함.
        for(int i=0;i<3;i++){
            System.out.println(bookArray1[i]);
            System.out.println(bookArray2[i]);
        }
        bookArray2[0] = new Book();
        bookArray2[1] = new Book();
        bookArray2[2] = new Book();

        for(int i=0;i<3;i++){
            bookArray2[i].setBookName(bookArray1[i].getBookName());
            bookArray2[i].setAuthor(bookArray1[i].getAuthor());
            bookArray2[i].showBookInfo();
        }

        bookArray1[0].setBookName("딴따라");
        bookArray1[0].showBookInfo();
        bookArray2[0].showBookInfo();

    }
}
