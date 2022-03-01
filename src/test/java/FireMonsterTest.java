import com.joseloya.Monster.FireMonster;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FireMonsterTest {

    //Spring uses assertJ library for testing
    @Test
    void attack_should_return_valid_data() {
        FireMonster f1 = new FireMonster("whatever");
        String attackMessage = f1.attack();
        Assertions.assertThat(attackMessage).isEqualTo("Attack with fire!");
    }
}