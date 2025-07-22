package com.feature.toggle.feature_toggle;

import com.amazonaws.services.appconfigdata.AWSAppConfigData;
import com.amazonaws.services.appconfigdata.AWSAppConfigDataClient;
import com.amazonaws.services.appconfigdata.model.GetLatestConfigurationRequest;
import com.amazonaws.services.appconfigdata.model.StartConfigurationSessionRequest;
import com.google.gson.Gson;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.nio.charset.StandardCharsets;

@Configuration
@EnableScheduling
public class AWSAppConfig {

    private String token;
//    private final AWSAppConfigData client;

//    public AWSAppConfig() {
//        System.out.println("init app config");
//        var client = AWSAppConfigDataClient.builder().build();
//        var request = new StartConfigurationSessionRequest();
//        request.setEnvironmentIdentifier("DemoEnviroment");
//        request.setApplicationIdentifier("osghpmn");
//        request.setConfigurationProfileIdentifier("iruvaef");
//        request.setRequiredMinimumPollIntervalInSeconds(15);
//        var result = client.startConfigurationSession(request);
//        this.client = client;
//        this.token = result.getInitialConfigurationToken();
//    }
//
//    @Scheduled(fixedRate = 20000)
//    public void pollConfiguration() {
//        var request = new GetLatestConfigurationRequest();
//        request.setConfigurationToken(token);
//        var result = client.getLatestConfiguration(request);
//        this.token = result.getNextPollConfigurationToken();
//        String configuration = StandardCharsets.UTF_8.decode(result.getConfiguration()).toString();
//        Gson gson = new Gson();
//        if (configuration != null) {
//            FeatureProperties featureProperties = gson.fromJson(configuration, FeatureProperties.class);
//            if(featureProperties != null) {
//                System.out.println("feature pROPERTIES :: " + featureProperties);
//                boolean isUploadEnabled = featureProperties.get("is_upload_enabled").isEnabled();
//
//                System.out.println("*********************");
//                System.out.println("isUploadEnabled :: " + isUploadEnabled);
//                System.out.println("*********************");
//            }
//        }
//        System.out.println("content type: :: " + result.getContentType());
//        System.out.println("configuration: ::" + configuration);
//    }
}
