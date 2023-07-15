package io.github.primelib.pagerduty4j.rest.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

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
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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
     * Constructs a validated implementation of {@link ExtensionSchema}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ExtensionSchema(Consumer<ExtensionSchema> spec) {
        spec.accept(this);
    }

    /**
     * A small logo, 18-by-18 pixels.
     */
    @JsonProperty("icon_url")
    protected String iconUrl;

    /**
     * A large logo, 75 pixels high and no more than 300 pixels wide.
     */
    @JsonProperty("logo_url")
    protected String logoUrl;

    /**
     * Human friendly display label
     */
    @JsonProperty("label")
    protected String label;

    /**
     * Machine friendly display label
     */
    @JsonProperty("key")
    protected String key;

    /**
     * The long description for the Extension
     */
    @JsonProperty("description")
    protected String description;

    /**
     * A link to the extension's support guide
     */
    @JsonProperty("guide_url")
    protected String guideUrl;

    /**
     * The types of PagerDuty incident events that will activate this Extension
     */
    @JsonProperty("send_types")
    protected Set<SendTypesEnum> sendTypes;

    /**
     * The url that the webhook payload will be sent to for this Extension.
     */
    @JsonProperty("url")
    protected String url;


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
