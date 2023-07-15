package io.github.primelib.pagerduty4j.rest.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.time.OffsetDateTime;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ChangeEvent
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "id",
    "summary",
    "type",
    "self",
    "html_url",
    "timestamp",
    "services",
    "integration",
    "routing_key",
    "source",
    "links",
    "images",
    "custom_details"
})
@JsonTypeName("ChangeEvent")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ChangeEvent {

    /**
     * Constructs a validated implementation of {@link ChangeEvent}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ChangeEvent(Consumer<ChangeEvent> spec) {
        spec.accept(this);
    }

    @JsonProperty("id")
    protected String id;

    /**
     * A brief text summary of the event. Displayed in PagerDuty to provide information about the change. The maximum permitted length of this property is 1024 characters.
     */
    @JsonProperty("summary")
    protected String summary;

    /**
     * The type of object being created.
     */
    @JsonProperty("type")
    protected TypeEnum type = TypeEnum.CHANGE_EVENT;

    /**
     * the API show URL at which the object is accessible
     */
    @JsonProperty("self")
    protected String self;

    /**
     * a URL at which the entity is uniquely displayed in the Web app
     */
    @JsonProperty("html_url")
    protected String htmlUrl;

    /**
     * The time at which the emitting tool detected or generated the event.
     */
    @JsonProperty("timestamp")
    protected OffsetDateTime timestamp;

    /**
     * An array containing Service objects that this change event is associated with.
     */
    @JsonProperty("services")
    protected List<ServiceReference> services;

    @JsonProperty("integration")
    protected ChangeEventAllOfIntegration integration;

    /**
     * This is the 32 character Integration Key for an Integration on a Service. The same Integration Key can be used for both alert and change events.
     */
    @JsonProperty("routing_key")
    protected String routingKey;

    /**
     * The unique name of the location where the Change Event occurred.
     */
    @JsonProperty("source")
    protected String source;

    /**
     * List of links to include.
     */
    @JsonProperty("links")
    protected List<ChangeEventAllOfLinks> links;

    @JsonProperty("images")
    protected List<ChangeEventAllOfImages> images;

    /**
     * Additional details about the change event.
     */
    @JsonProperty("custom_details")
    protected Object customDetails;


    /**
     * The type of object being created.
     */
    @AllArgsConstructor
    public enum TypeEnum {
        CHANGE_EVENT("change_event");

        private final String value;
    }

}
