public class Bus {

    int Max_passenger_bus = 45;
    int Now_passenger_bus;
    int Pay = 1000;


    // 현재 탑승 상황
    public void board(int passengers) {
        this.Now_passenger_bus += passengers;

        if (Now_passenger_bus > Max_passenger_bus) {
            System.out.println("최대 승객 수 초과");
            this.Now_passenger_bus -= passengers;
        } else {
            System.out.println("탑승 승객 수 = " + passengers);
            System.out.println("잔여 승객 수 = " + (this.Max_passenger_bus - passengers));
            System.out.println("요금 확인 = " + (this.Pay * passengers));
        }
    }

}