package prajwalhacker;



class CountdownTimer implements Runnable {
    private int seconds;
    public CountdownTimer(int seconds) {
        this.seconds = seconds;
    }
    @Override
    public void run() {
        try {
            while (seconds > 0) {
                System.out.println("Time remaining: " + seconds + " seconds");
                Thread.sleep(1000);  // Sleep for 1 second
                seconds--;
            }
            System.out.println("Time's up!");
        } catch (InterruptedException e) {
            System.out.println("Timer interrupted");
        }
    }
}