package programmers.lv1;

import java.util.ArrayList;

class 실패율 {
    ArrayList<FailureRate> failureRateList = new ArrayList<>();

    static class FailureRate {
        int stage;
        float failRate;

        FailureRate(int stage, float failRate) {
            this.stage = stage;
            this.failRate = failRate;
        }
    }

    public static int getRemainingPlayers(int[] stages, int stage) {
        int remainingPlayers = 0;

        for (int i = 0; i < stages.length; i++) {
            if (stages[i] >= stage) {
                remainingPlayers++;
            }
        }

        return remainingPlayers;
    }

    public static int getStagePlayers(int[] stages, int stage) {
        int stagePlayers = 0;

        for (int i = 0; i < stages.length; i++) {
            if (stages[i] == stage) {
                stagePlayers++;
            }
        }

        return stagePlayers;
    }

    public static float getFailureRate(int[] stages, int stage) {
        int stagePlayers = getStagePlayers(stages, stage);
        int remainingPlayers = getRemainingPlayers(stages, stage);

        return (float) stagePlayers / (float) remainingPlayers;
    }

    public void setFailure(int[] stages, int stage) {
        for (int i = 1; i <= stage; i++) {
            failureRateList.add(new FailureRate(i, getFailureRate(stages, i)));
        }
    }

    public int[] solution(int N, int[] stages) {
        int[] answer = {};

        setFailure(stages, N);

        return answer;
    }
}
