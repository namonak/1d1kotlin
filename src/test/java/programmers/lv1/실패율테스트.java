package programmers.lv1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class 실패율테스트 {
    @Test
    @DisplayName("잔여 플레이어 수 구하기")
    void 잔여_플레이어_수_구하기() {
        assertThat(실패율.getRemainingPlayers(new int[]{2, 1, 2, 6, 2, 4, 3, 3}, 1)).isEqualTo(8);
        assertThat(실패율.getRemainingPlayers(new int[]{2, 1, 2, 6, 2, 4, 3, 3}, 2)).isEqualTo(7);
        assertThat(실패율.getRemainingPlayers(new int[]{2, 1, 2, 6, 2, 4, 3, 3}, 3)).isEqualTo(4);
        assertThat(실패율.getRemainingPlayers(new int[]{2, 1, 2, 6, 2, 4, 3, 3}, 4)).isEqualTo(2);
        assertThat(실패율.getRemainingPlayers(new int[]{2, 1, 2, 6, 2, 4, 3, 3}, 5)).isEqualTo(1);
    }

    @Test
    @DisplayName("스테이지에 도달한 플레이어 수 구하기")
    void 스테이지에_도달한_플레이어_수_구하기() {
        assertThat(실패율.getStagePlayers(new int[]{2, 1, 2, 6, 2, 4, 3, 3}, 1)).isEqualTo(1);
        assertThat(실패율.getStagePlayers(new int[]{2, 1, 2, 6, 2, 4, 3, 3}, 2)).isEqualTo(3);
        assertThat(실패율.getStagePlayers(new int[]{2, 1, 2, 6, 2, 4, 3, 3}, 3)).isEqualTo(2);
        assertThat(실패율.getStagePlayers(new int[]{2, 1, 2, 6, 2, 4, 3, 3}, 4)).isEqualTo(1);
        assertThat(실패율.getStagePlayers(new int[]{2, 1, 2, 6, 2, 4, 3, 3}, 5)).isEqualTo(0);
    }
}
