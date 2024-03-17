package ThreadsProb;

import java.util.Random;

class ThreadsProblem extends Thread {
    private int threadId;
    private int totalSteps;

    public ThreadsProblem(int threadId, int totalSteps) {
        this.threadId = threadId;
        this.totalSteps = totalSteps;
    }

    @Override
    public void run() {
        Random random = new Random();
        for (int step = 1; step <= totalSteps; step++) {
            System.out.println("Thread with ID " + threadId + " is at step " + step + " out of " + totalSteps + ".");
            try {
                Thread.sleep(random.nextInt(991) + 10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Thread with ID " + threadId + " has stopped executing.");
    }
}


