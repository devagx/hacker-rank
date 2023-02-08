import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
class TowerBreakerTests {
    @Test
    void towerBreakers_1Tower4Height_returns1(){
        int towers = 1;
        int height = 4;

        int result = Result.towerBreakers(towers, height);

        assertThat(result).isEqualTo(1);
    }
}