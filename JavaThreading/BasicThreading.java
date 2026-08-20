/*
* There are 2 ways to use threading
*  - Implementing Runnable Interface as class can implement Multiple Interfaces
*  - Extending thread class as Class can extend only 1 single other class;
*  - The Thread class itself Implements the Runnable interface
* */

class UsesRunnable implements Runnable{
    @Override
    public void run(){
        System.out.println("This is called from the runnable " + Thread.currentThread().getName());
    }
}

class ExtendsThreads extends Thread{
    @Override
    public void run(){
        System.out.println("This is called from the Thread extended class " + Thread.currentThread().getName());
    }
}

public class BasicThreading {
     static void main(String[] args) {
         UsesRunnable usesRunnable = new UsesRunnable();
         Thread thread = new Thread(usesRunnable);
         thread.start(); // invoke run of Thread class

         System.out.println("This is the current main thread : " + Thread.currentThread().getName());

         ExtendsThreads threadsT2 = new ExtendsThreads();
         threadsT2.start();

         System.out.println("This is the current main thread : " + Thread.currentThread().getName());
    }
}
