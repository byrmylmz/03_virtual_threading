public class SimpleVirtualThreads {
    public static void main(String[] args) {
        // 3 tane virtual thread başlat
        for (int i = 0; i < 3; i++) {
            final int threadNumber = i;
            Thread.ofVirtual().start(() -> {
                for (int j = 0; j <= 5; j++) {
                    System.out.println("Thread " + threadNumber + " - " + j);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        System.out.println("Thread " + threadNumber + " interrupted");
                    }
                }
            });
        }

        // Main thread de kendi işini yapıyor
        for (int i = 0; i <= 5; i++) {
            System.out.println("Main thread - " + i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("Main thread interrupted");
            }
        }

        System.out.println("Main thread done.");
    }
}
