package lesson9;

public class MyThread extends Thread {
    StringBuilder sb;

    public MyThread(StringBuilder sb) {
        this.sb = sb;
    }

    @Override
    public void run() {
        synchronized (sb) {
            for (int i = 0; i < 100; ++i)
                System.out.print(i + "" + sb + "    ");
            System.out.println("\n");
            sb.setCharAt(0, (char) (sb.charAt(0) + 1));
        }
    }

    public static void main(String[] msi) {
        StringBuilder sb = new StringBuilder("a");
        for (int i = 0; i < 3; i++)
            new MyThread(sb).start();
    }
}