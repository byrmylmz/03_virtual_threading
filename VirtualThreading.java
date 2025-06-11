public class VirtualThreading {
    public static void main(String[] args) {
        //start virtual threads 1000 virtual threads
        for (int i = 0; i <= 10; i++) {
            final int threadNumber = i;
            Thread.ofVirtual().start(()-> printMessages("Thread " + threadNumber));
        }

        //main thread start here
        long starTime = System.currentTimeMillis();
        while (System.currentTimeMillis()-starTime<10000){
            printMessages("Main Thread");
            try{
                Thread.sleep(500);
            }catch (InterruptedException e){
                System.out.println("Main Thread interrupted");
            }
        }
        System.out.println("Main Thread done after 2 minutes");
    }

    private static void printMessages(String threadName) {
        for (int i = 0; i <= 100; i++) {
            System.out.println(threadName + "-" + i);
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                System.out.println("interrupted");
            }
        }

    }
}
