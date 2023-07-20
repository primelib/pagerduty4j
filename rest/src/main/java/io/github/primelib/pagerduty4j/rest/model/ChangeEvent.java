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

import java.time.OffsetDateTime;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ChangeEvent
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
    protected TypeEnum type;

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
     * Constructs a validated instance of {@link ChangeEvent}.
     *
     * @param spec the specification to process
     */
    public ChangeEvent(Consumer<ChangeEvent> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ChangeEvent}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ChangeEvent(Consumer)} instead.
     * @param id var.name
     * @param summary A brief text summary of the event. Displayed in PagerDuty to provide information about the change. The maximum permitted length of this property is 1024 characters.
     * @param type The type of object being created.
     * @param self the API show URL at which the object is accessible
     * @param htmlUrl a URL at which the entity is uniquely displayed in the Web app
     * @param timestamp The time at which the emitting tool detected or generated the event.
     * @param services An array containing Service objects that this change event is associated with.
     * @param integration var.name
     * @param routingKey This is the 32 character Integration Key for an Integration on a Service. The same Integration Key can be used for both alert and change events.
     * @param source The unique name of the location where the Change Event occurred.
     * @param links List of links to include.
     * @param images var.name
     * @param customDetails Additional details about the change event.
     */
    @ApiStatus.Internal
    public ChangeEvent(String id, String summary, TypeEnum type, String self, String htmlUrl, OffsetDateTime timestamp, List<ServiceReference> services, ChangeEventAllOfIntegration integration, String routingKey, String source, List<ChangeEventAllOfLinks> links, List<ChangeEventAllOfImages> images, Object customDetails) {
        this.id = id;
        this.summary = summary;
        this.type = type;
        this.self = self;
        this.htmlUrl = htmlUrl;
        this.timestamp = timestamp;
        this.services = services;
        this.integration = integration;
        this.routingKey = routingKey;
        this.source = source;
        this.links = links;
        this.images = images;
        this.customDetails = customDetails;
    }

    /**
     * The type of object being created.
     */
    @AllArgsConstructor
    public enum TypeEnum {
        CHANGE_EVENT("change_event");

        private final String value;
    }

}
