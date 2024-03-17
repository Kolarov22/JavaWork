package ThreadsProb;

import ThreadsProb.ThreadsProblem;

public class ThreadsProblemMain {

        public static void main(String[] args) {
            for (int i = 0; i < 5; i++) {
                int threadId = i + 1;
                int totalSteps = (int) (Math.random() * 16) + 5;
                ThreadsProblem thread = new ThreadsProblem(threadId, totalSteps);
                thread.start();
            }
        }

}
