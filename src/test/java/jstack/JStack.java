package jstack;

import org.junit.Test;

/**
 * @author dominiczhu
 * @version 1.0
 * @title JStack
 * @date 2021/7/7 下午2:37
 */
public class JStack {

    @Test
    public void whileTrue(){
        while (true) {
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //Do Nothing
        }
    }

    @Test
    public void jstackThread() {
        Thread thread = new Thread(new Thread1());
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Thread1 implements Runnable{
    @Override
    public void run() {
        while(true){
//            System.out.println(1);
        }
    }
}