package inheritance2;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class JavaInheritance2Test {
    @Test
    void add_fromSuperClassInput2Integers_returnsIntegersSum() {
        Arithmetic arithmetic = new Arithmetic();
        int sumOfInts = arithmetic.add(1, 4);

        assertThat(sumOfInts).isEqualTo(5);
    }

    @Test
    void add_fromSubClassInput2Integers_returnsIntegersSum() {
        Adder adder = new Adder();
        int sumOfInts = adder.add(1, 4);

        assertThat(sumOfInts).isEqualTo(5);
    }
}
