package io.github.primelib.pagerduty4j.eventsv2.model;

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
import lombok.experimental.Accessors;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateChangeEventRequest
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
    "payload",
    "routing_key",
    "links",
    "images"
})
@JsonTypeName("createChangeEvent_request")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateChangeEventRequest {

    @JsonProperty("payload")
    protected ChangeEventPayload payload;

    /**
     * The GUID of one of your Events API V2 integrations. This is the "Integration Key" listed on the Events API V2 integration's detail page.
     */
    @JsonProperty("routing_key")
    protected String routingKey;

    /**
     * Links to be shown on the alert and/or corresponding incident.
     */
    @JsonProperty("links")
    protected List<LinksInner> links;

    /**
     * Images to be displayed on the alert and/or corresponding incident.
     */
    @JsonProperty("images")
    protected List<ImagesInner> images;

    /**
     * Constructs a validated instance of {@link CreateChangeEventRequest}.
     *
     * @param spec the specification to process
     */
    public CreateChangeEventRequest(Consumer<CreateChangeEventRequest> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link CreateChangeEventRequest}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #CreateChangeEventRequest(Consumer)} instead.
     * @param payload var.name
     * @param routingKey The GUID of one of your Events API V2 integrations. This is the "Integration Key" listed on the Events API V2 integration's detail page.
     * @param links Links to be shown on the alert and/or corresponding incident.
     * @param images Images to be displayed on the alert and/or corresponding incident.
     */
    @ApiStatus.Internal
    public CreateChangeEventRequest(ChangeEventPayload payload, String routingKey, List<LinksInner> links, List<ImagesInner> images) {
        this.payload = payload;
        this.routingKey = routingKey;
        this.links = links;
        this.images = images;
    }

}
