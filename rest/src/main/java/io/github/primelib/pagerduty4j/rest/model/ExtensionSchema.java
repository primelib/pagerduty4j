package io.github.primelib.pagerduty4j.rest.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.experimental.Accessors;

import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * ExtensionSchema
 *
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
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
     * Constructs a validated instance of {@link ExtensionSchema}.
     *
     * @param spec the specification to process
     */
    public ExtensionSchema(Consumer<ExtensionSchema> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ExtensionSchema}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ExtensionSchema(Consumer)} instead.
     * @param iconUrl A small logo, 18-by-18 pixels.
     * @param logoUrl A large logo, 75 pixels high and no more than 300 pixels wide.
     * @param label Human friendly display label
     * @param key Machine friendly display label
     * @param description The long description for the Extension
     * @param guideUrl A link to the extension's support guide
     * @param sendTypes The types of PagerDuty incident events that will activate this Extension
     * @param url The url that the webhook payload will be sent to for this Extension.
     */
    @ApiStatus.Internal
    public ExtensionSchema(String iconUrl, String logoUrl, String label, String key, String description, String guideUrl, Set<SendTypesEnum> sendTypes, String url) {
        this.iconUrl = iconUrl;
        this.logoUrl = logoUrl;
        this.label = label;
        this.key = key;
        this.description = description;
        this.guideUrl = guideUrl;
        this.sendTypes = sendTypes;
        this.url = url;
    }

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

        private static final SendTypesEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static SendTypesEnum of(String input) {
            if (input != null) {
                for (SendTypesEnum v : VALUES) {
                    if (input.equalsIgnoreCase(v.value)) 
                        return v;
                }
            }

            return null;
        }

        @JsonValue
        public String getValue() {
            return value;
        }
    }

}
