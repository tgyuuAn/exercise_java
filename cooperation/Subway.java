package cooperation;

public class Subway{
    int lineNumber;
    int passengerCount;
    int money;

    public Subway(int lineNumber){
        this.lineNumber = lineNumber;
        this.passengerCount = 0;
    }

    public void take(int money){
        this.passengerCount++;
        this.money += money;
    }
    public void showInfo(){
        System.out.println("지하철 현재 승객 :"+this.passengerCount+"현재 번 돈 :"+ this.money);
    }
}
