package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

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
@NoArgsConstructor
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
    private String id;

    /**
     * A brief text summary of the event. Displayed in PagerDuty to provide information about the change. The maximum permitted length of this property is 1024 characters.
     */
    @JsonProperty("summary")
    private String summary;

    /**
     * The type of object being created.
     */
    @JsonProperty("type")
    private TypeEnum type = TypeEnum.CHANGE_EVENT;

    /**
     * the API show URL at which the object is accessible
     */
    @JsonProperty("self")
    private String self;

    /**
     * a URL at which the entity is uniquely displayed in the Web app
     */
    @JsonProperty("html_url")
    private String htmlUrl;

    /**
     * The time at which the emitting tool detected or generated the event.
     */
    @JsonProperty("timestamp")
    private OffsetDateTime timestamp;

    /**
     * An array containing Service objects that this change event is associated with.
     */
    @JsonProperty("services")
    private List<ServiceReference> services;

    @JsonProperty("integration")
    private ChangeEventAllOfIntegration integration;

    /**
     * This is the 32 character Integration Key for an Integration on a Service. The same Integration Key can be used for both alert and change events.
     */
    @JsonProperty("routing_key")
    private String routingKey;

    /**
     * The unique name of the location where the Change Event occurred.
     */
    @JsonProperty("source")
    private String source;

    /**
     * List of links to include.
     */
    @JsonProperty("links")
    private List<ChangeEventAllOfLinks> links;

    @JsonProperty("images")
    private List<ChangeEventAllOfImages> images;

    /**
     * Additional details about the change event.
     */
    @JsonProperty("custom_details")
    private Object customDetails;


    /**
     * The type of object being created.
     */
    @AllArgsConstructor
    public enum TypeEnum {
        CHANGE_EVENT("change_event");

        private final String value;
    }

}
