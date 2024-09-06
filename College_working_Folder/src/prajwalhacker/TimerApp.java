package prajwalhacker;




public class TimerApp {

    public static void main(String[] args) {
        int countdownTime = 10;  // Set countdown time in //seconds
        CountdownTimer timer = new CountdownTimer(countdownTime);
        Thread timerThread = new Thread(timer);
        timerThread.start();
    }


}
