public class Main {
    public static void main(String[] args){

        PublicTransport publictransport = new PublicTransport();
        Bus bus1 = new Bus();
        Bus bus2 = new Bus();
        Taxi taxi1 = new Taxi();
        Taxi taxi2 = new Taxi();

        bus1.board(2);
        publictransport.now_oil(-50);
        publictransport.post_states(false);
        bus1.board(50);
        publictransport.now_oil(-45);
        publictransport.get_states_info();

        bus2.board(5);
        publictransport.now_oil(-40);
        publictransport.post_states(false);
        bus2.board(30);
        publictransport.now_oil(-57);
        publictransport.get_states_info();


        taxi1.board(2);
        taxi1.destination();
        taxi2.distancetodestination(0);
        publictransport.now_oil(-70);
        publictransport.post_states(false);
        taxi1.post_pay();
        taxi1.board(5);
        publictransport.now_oil(-21);
        publictransport.get_states_info();



        taxi2.board(3);
        taxi2.destination();
        taxi2.distancetodestination(10000);
        publictransport.now_oil(-50);
        publictransport.post_states(false);
        taxi2.post_pay();
        publictransport.now_oil(-45);
        publictransport.get_states_info();
    }
}