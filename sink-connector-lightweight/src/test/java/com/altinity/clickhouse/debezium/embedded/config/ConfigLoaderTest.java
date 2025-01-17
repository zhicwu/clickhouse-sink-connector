package com.altinity.clickhouse.debezium.embedded.config;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigLoaderTest {

    @Test
    public void testLoad() {
        ConfigLoader loader = new ConfigLoader();
        Properties props = loader.load();

        Assertions.assertNotNull(props);
    }

    @Test
    public void testLoadFromFile() throws FileNotFoundException {
        ConfigLoader loader = new ConfigLoader();
        Properties props = loader.loadFromFile("/home/kanthi/Documents/GITHUB/clickhouse-sink-connector/sink-connector-lightweight/src/test/java/com/altinity/clickhouse/debezium/embedded/config/mysql_config.yaml");

        Assertions.assertNotNull(props);


    }
}
