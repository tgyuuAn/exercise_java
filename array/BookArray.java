package array;

public class BookArray {
    public static void main(String[] args){
        Book[] library = new Book[5]; //객체 배열 5개 선언
        //객체가 5개 만들어 지는 것이 아니라, 책을 가르킬 주소가 5개 만들어짐.
        //나중에 new를 이용하여 따로 또 만들어 줘야함.
        for(int i=0;i<library.length;i++){
            System.out.println(library[i]);
        }

        library[0] = new Book("태백산맥1","조정래");
        library[1] = new Book("태백산맥2","조정래");
        library[2] = new Book("태백산맥3","조정래");
        library[3] = new Book("태백산맥4","조정래");
        library[4] = new Book("태백산맥5","조정래");

        for(int i=0;i<library.length;i++){
            System.out.println(library[i]);
        }

        for(int i=0;i<library.length;i++){
            library[i].showBookInfo();
        }

    }
}
