package fr.fierdecoder.trustyourtests;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringHelperTest {
    @Test
    public void shouldBeEmpty() {
        StringHelper stringHelper = new StringHelper();
        assertThat(stringHelper.isEmpty("")).isTrue();
    }
}