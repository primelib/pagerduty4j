package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ExtensionSchema
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "icon_url",
    "logo_url",
    "label",
    "key",
    "description",
    "guide_url",
    "send_types",
    "url"
})
@JsonTypeName("ExtensionSchema")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ExtensionSchema {

    /**
     * A small logo, 18-by-18 pixels.
     */
    @JsonProperty("icon_url")
    private String iconUrl;

    /**
     * A large logo, 75 pixels high and no more than 300 pixels wide.
     */
    @JsonProperty("logo_url")
    private String logoUrl;

    /**
     * Human friendly display label
     */
    @JsonProperty("label")
    private String label;

    /**
     * Machine friendly display label
     */
    @JsonProperty("key")
    private String key;

    /**
     * The long description for the Extension
     */
    @JsonProperty("description")
    private String description;

    /**
     * A link to the extension's support guide
     */
    @JsonProperty("guide_url")
    private String guideUrl;

    /**
     * The types of PagerDuty incident events that will activate this Extension
     */
    @JsonProperty("send_types")
    private Set<SendTypesEnum> sendTypes;

    /**
     * The url that the webhook payload will be sent to for this Extension.
     */
    @JsonProperty("url")
    private String url;


    /**
     * The types of PagerDuty incident events that will activate this Extension
     */
    @AllArgsConstructor
    public enum SendTypesEnum {
        TRIGGER("trigger"),
        ACKNOWLEDGE("acknowledge"),
        RESOLVE("resolve"),
        DELEGATE("delegate"),
        ESCALATE("escalate"),
        UNACKNOWLEDGE("unacknowledge"),
        ASSIGN("assign"),
        CUSTOM("custom");

        private final String value;
    }

}
