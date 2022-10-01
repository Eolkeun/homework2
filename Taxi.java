import javax.print.attribute.standard.Destination;

public class Taxi {

    String Destination = "서울역"; // 목적지
    int BasicDistance = 2000; // 기본거리
    int BasicPay = 4000; //기본요금
    int DistanceToDestination; // 목적지까지 거리
    int PayPerDistance; // 거리당 요금
    int ExtraDistance;
    int pay;
    int Max_passenger_taxi = 4;
    int Now_passenger_taxi;


    // 목적지 장소
    public void destination() {
        Destination = "서울역";
        System.out.println("목적지 = "+Destination);
    }

    // 목적지까지 거리
    public void distancetodestination(int pay) {
        this.DistanceToDestination += pay;
        System.out.println("목적기까지 남은거리");
        System.out.println(2000+this.DistanceToDestination);
    }


    // 현재 탑승 상황
    public void board(int passengers) {
        this.Now_passenger_taxi += passengers;

        if (Now_passenger_taxi > Max_passenger_taxi) {
            System.out.println("탑승 불가");
            this.Now_passenger_taxi -= passengers;
        } else {
            System.out.println("탑승 승객 수 = " + passengers);
            System.out.println("잔여 승객 수 = " + (this.Max_passenger_taxi - passengers));
        }
    }

    //추가요금 + 총 요금 계산
    public void post_pay() {

        if (DistanceToDestination > 2000) {
            // 목적지까지 거리 - 기본거리 = 추가거리
            ExtraDistance = DistanceToDestination - BasicDistance;
            // 추가 지불 : 50미터당 100원 지불
            PayPerDistance = (ExtraDistance / 50) * 100;
            // 총 비용 = 기본요금 + 추가비용
            pay = BasicPay + PayPerDistance;
            System.out.println("요금은 " + pay + "원 입니다");
        } else {
            System.out.println("요금은 " + BasicPay + "원 입니다");
        }
    }
}