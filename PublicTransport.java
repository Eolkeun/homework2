public class PublicTransport {


    int number;
    int Now_Oil = 100;
    int Now_speed = 0;
    boolean change_speed;
    String status = "운행중"; //상태(운행, 일반)


    // 속도 변경
    public int getNow_speed ( int power){
        if (Now_Oil >= 10) {
            status = "운행";
            Now_speed += power;

        } else {
            post_states(false);
        }
        return this.Now_speed;
    }

    // 차량 랜덤 번호
    public int get_number () {
        this.number = (int) (Math.random()) * 9999 + 1;
        return this.number;
    }

    // 상태 변경
    public boolean post_states ( boolean change){
        if (change == false || this.Now_Oil == 0) {
            status = "차고지행";
        }
        return change;
    }

    // 오일 변경
    public void now_oil ( int use_oil){
        this.Now_Oil += use_oil;
        System.out.println();
        System.out.println("현재 주유량 = " + this.Now_Oil);
    }

    // 출력
    public void get_states_info () {
        System.out.println();
        System.out.println("상태를 확인합니다");
        System.out.println(("상태 : " + status));
        System.out.println("남은 주유량 : " + this.Now_Oil);
        if (this.Now_Oil < 10) {
            System.out.println("주유 필요");
        }
    }



}