package fr.fierdecoder.trustyourtests;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class IntegerAdderTest {
    @Test
    public void testSum() {
        int result = IntegerAdder.sum(8, 0);

        assertThat(result).isEqualTo(8);
    }
}
