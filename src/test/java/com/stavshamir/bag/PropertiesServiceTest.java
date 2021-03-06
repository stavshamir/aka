package com.stavshamir.bag;

import org.junit.Test;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;


public class PropertiesServiceTest {

    private PropertiesService propertiesService;

    public PropertiesServiceTest() throws IOException {
        propertiesService = new PropertiesService("src/test/resources/application.properties");
    }

    @Test
    public void getBashHistoryFilePath() {
        assertThat(propertiesService.getBashHistoryFilePath())
                .isEqualTo("/home/stav/.bash_history");
    }

    @Test
    public void getAliasUserFilePath() {
        assertThat(propertiesService.getAliasUserFilePath())
                .isEqualTo("/home/stav/IdeaProjects/bag/src/test/resources/aliases");
    }

    @Test
    public void getAliasScript() {
        assertThat(propertiesService.getAliasScript())
                .isEqualTo("/home/stav/IdeaProjects/bag/src/test/resources/alias.sh");
    }
}