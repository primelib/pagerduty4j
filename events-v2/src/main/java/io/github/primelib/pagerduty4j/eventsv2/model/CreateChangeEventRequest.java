package io.github.primelib.pagerduty4j.eventsv2.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateChangeEventRequest
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "payload",
    "routing_key",
    "links",
    "images"
})
@JsonTypeName("createChangeEvent_request")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateChangeEventRequest {

    /**
     * Constructs a validated implementation of {@link CreateChangeEventRequest}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public CreateChangeEventRequest(Consumer<CreateChangeEventRequest> spec) {
        spec.accept(this);
    }

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


}
