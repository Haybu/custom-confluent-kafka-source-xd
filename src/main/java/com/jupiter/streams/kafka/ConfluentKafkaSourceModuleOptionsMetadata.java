package com.jupiter.streams.kafka;


import org.springframework.integration.x.kafka.KafkaConsumerOptionsMixin;
import org.springframework.integration.x.kafka.KafkaOffsetTopicOptionsMixin;
import org.springframework.integration.x.kafka.KafkaZKOptionMixin;
import org.springframework.xd.module.options.spi.Mixin;
import org.springframework.xd.module.options.spi.ModuleOption;
import org.springframework.integration.x.kafka.KafkaSourceModuleOptionsMetadata;

/**
 * Created by hmohamed on 7/3/15.
 */
@Mixin({KafkaZKOptionMixin.class, KafkaConsumerOptionsMixin.class, KafkaOffsetTopicOptionsMixin.class})
public class ConfluentKafkaSourceModuleOptionsMetadata extends KafkaSourceModuleOptionsMetadata {

    private String registryUrl = "";
    private boolean autoCommit = false;

    public boolean isAutoCommit() {
        return autoCommit;
    }

    @ModuleOption("is auto commit")
    public void setAutoCommit(boolean _autoCommit) {
        this.autoCommit = _autoCommit;
    }

    public String getRegistryUrl() {
        return registryUrl;
    }

    @ModuleOption("avro registry url")
    public void setRegistryUrl(String _registryUrl) {
        this.registryUrl = _registryUrl;
    }



}
