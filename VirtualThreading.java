public class VirtualThreading {
    public static void main(String[] args) {
        for (int i = 0; i <= 1000; i++) {
            final int threadNumber = i;
        }
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
