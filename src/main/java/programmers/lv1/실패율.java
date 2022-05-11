package programmers.lv1;

class 실패율 {
    public static int getRemainingPlayers(int[] stages, int stage) {
        int remainingPlayers = 0;

        for (int i = 0; i < stages.length; i++) {
            if (stages[i] >= stage) {
                remainingPlayers++;
            }
        }

        return remainingPlayers;
    }

    public int[] solution(int N, int[] stages) {
        int[] answer = {};
        return answer;
    }
}
