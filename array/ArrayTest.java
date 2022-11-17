package array;

public class ArrayTest {
    public static void main(String[] args){
        int [] numbers = new int[10]; //int 10칸이니 40바이트
        int [] init_numbers = new int[] {0,1,2}; //int 3칸이니 12바이트
        //배열 초기화
        int [] studentIDs = new int[10];

        for(int i=0;i<numbers.length;i++){
            numbers[i] = i;
            System.out.printf("%d",numbers[i]);
            System.out.printf("\n");
            System.out.printf("%d",studentIDs[i]);
        }

        System.out.printf("\n%d %d", numbers.length, init_numbers.length);
    }
}
