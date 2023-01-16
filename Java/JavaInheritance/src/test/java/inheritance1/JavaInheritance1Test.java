package inheritance1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class JavaInheritance1Test {
    @Test
    void walk_noCondition_returnsCorrectString() {
        Animal animal = new Animal();
        String message = animal.walk();

        assertThat(message).isEqualTo("I am walking");
    }

    @Test
    void fly_noCondition_returnsCorrectString() {
        Bird bird = new Bird();
        String message = bird.fly();

        assertThat(message).isEqualTo("I am flying");
    }

    @Test
    void fly_checkBirdCanWalk_returnsCorrectString() {
        Bird bird = new Bird();
        String message = bird.walk();

        assertThat(message).isEqualTo("I am walking");
    }
}
