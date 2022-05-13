package programmers.lv1;

import java.util.ArrayList;
import java.util.Collections;

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

    static int getRemainingPlayers(int[] stages, int stage) {
        int remainingPlayers = 0;

        for (int i = 0; i < stages.length; i++) {
            if (stages[i] >= stage) {
                remainingPlayers++;
            }
        }

        return remainingPlayers;
    }

    static int getStagePlayers(int[] stages, int stage) {
        int stagePlayers = 0;

        for (int i = 0; i < stages.length; i++) {
            if (stages[i] == stage) {
                stagePlayers++;
            }
        }

        return stagePlayers;
    }

    static float getFailureRate(int[] stages, int stage) {
        int stagePlayers = getStagePlayers(stages, stage);
        int remainingPlayers = getRemainingPlayers(stages, stage);

        return (float) stagePlayers / (float) remainingPlayers;
    }

    private void setFailure(int[] stages, int stage) {
        for (int i = 1; i <= stage; i++) {
            failureRateList.add(new FailureRate(i, getFailureRate(stages, i)));
        }
    }

    private int[] getFailureList() {
        int[] result = new int[failureRateList.size()];

        Collections.sort(failureRateList, ((o1, o2) -> Float.compare(o2.failRate, o1.failRate)));

        for (int i=0; i<failureRateList.size(); i++) {
            result[i] = failureRateList.get(i).stage;
        }

        return result;
    }

    public int[] solution(int N, int[] stages) {
        int[] answer = {};

        setFailure(stages, N);
        answer = getFailureList();

        return answer;
    }
}
