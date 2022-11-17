package cooperation;

    public class Bus {
        int busNumber;
        int passengerCount;
        int money;

        public Bus(int busNumber){
            this.busNumber = busNumber;
            this.passengerCount = 0;
        }
        public void take(int money){
            this.passengerCount++;
            this.money += money;
        }
        public void showInfo(){
            System.out.println("버스 현재 승객 :"+this.passengerCount+"현재 번 돈 :"+ this.money);
        }
}
