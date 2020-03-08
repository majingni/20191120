package lesson2;

public class DaemonThread {
    public static void main(String[] args) {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(999999999L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        // 设置线程为守护线程
//        t.setDaemon(true);
        t.start();
    }
}
