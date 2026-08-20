/**
 * Here We are experimenting with monitor lock
 *  - the output we got from the code
 * This is from the task 2 :- Thread-1
 * This from the synchronized block :- Thread-1
 * This is from Task 1 :- Thread-0
 * This is the task3 :- Thread-2
 */
class ExperimentalClass{
    public void task1(){
        try{
            System.out.println("This is from Task 1 :- "  + Thread.currentThread().getName());
            Thread.sleep(5000);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void task2(){
        System.out.println("This is from the task 2 :- " + Thread.currentThread().getName());
        synchronized (this){
            System.out.println("This from the synchronized block :- " + Thread.currentThread().getName());
        }
    }

    public void task3(){
        System.out.println("This is the task3 :- " + Thread.currentThread().getName());
    }
}
public class MonitorLocks {
    static void main() {
        ExperimentalClass obj = new ExperimentalClass();
        Thread t1 = new Thread(() -> obj.task1());
        Thread t2 = new Thread(() -> obj.task2());
        Thread t3 = new Thread(() -> obj.task3());

        t1.start();;
        t2.start();
        t3.start();
    }
}
