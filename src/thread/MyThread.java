package thread;

public class MyThread extends Thread{
    public void run(){
        for (int i=0; i<10; i++){
            System.out.println("Suresh Shahi");
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e){
                Thread.currentThread().getState();
            }
        }
    }

    public static void main(String[] args) {
        MyThread myThread= new MyThread();
        myThread.run();
    }
}
