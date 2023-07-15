package io.github.primelib.pagerduty4j.eventsv2.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

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
@NoArgsConstructor
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
    private ChangeEventPayload payload;

    /**
     * The GUID of one of your Events API V2 integrations. This is the "Integration Key" listed on the Events API V2 integration's detail page.
     */
    @JsonProperty("routing_key")
    private String routingKey;

    /**
     * Links to be shown on the alert and/or corresponding incident.
     */
    @JsonProperty("links")
    private List<LinksInner> links;

    /**
     * Images to be displayed on the alert and/or corresponding incident.
     */
    @JsonProperty("images")
    private List<ImagesInner> images;


}
