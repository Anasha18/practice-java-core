package org.java.core.lesson1.exception_inerfaces;

public class Runner implements JobRunnable {
    @Override
    public void run() {
        System.out.println("lesson1.exception_inerfaces.JobRunnable is running");
    }
}
