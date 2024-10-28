package com.cabbookdriver.cabbookdriver.config;

import com.cabbookdriver.constant.AppConstant;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaConfig {


    public NewTopic topic(){
        return TopicBuilder
                     .name(AppConstant.CAB_LOCATION)
                     .build();
    }
}
