package com.feature.toggle.feature_toggle;

import org.commonmark.node.Node;
import org.commonmark.parser.Parser;
import org.commonmark.renderer.html.HtmlRenderer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FeatureToggleApplication {

    public static void main(String[] args) {
        System.out.println("FeatureToggleApplication");
        SpringApplication.run(FeatureToggleApplication.class, args);
  String markdown = "#### Hola Snailin como estas estamos aqui haciendo nada";

        Parser parser = Parser.builder().build();
        Node document = parser.parse(markdown);
        String htmlResult = HtmlRenderer.builder().build().render(document);
        System.out.println("htmlResult :: "+htmlResult);

    }

}
