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
 * CreateV2EventRequest
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "payload",
    "routing_key",
    "event_action",
    "dedup_key",
    "client",
    "client_url",
    "links",
    "images"
})
@JsonTypeName("createV2Event_request")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateV2EventRequest {

    @JsonProperty("payload")
    private Payload payload;

    /**
     * The GUID of one of your Events API V2 integrations. This is the "Integration Key" listed on the Events API V2 integration's detail page.
     */
    @JsonProperty("routing_key")
    private String routingKey;

    /**
     * The type of event. Can be `trigger`, `acknowledge` or `resolve`.
     */
    @JsonProperty("event_action")
    private EventActionEnum eventAction;

    /**
     * Identifies the alert to `trigger`, `acknowledge`, or `resolve`. Required unless the `event_type` is `trigger`.
     */
    @JsonProperty("dedup_key")
    private String dedupKey;

    /**
     * The name of the monitoring client that is triggering this event. (This field is only used for `trigger` events.)
     */
    @JsonProperty("client")
    private String client;

    /**
     * The URL of the monitoring client that is triggering this event. (This field is only used for `trigger` events.)
     */
    @JsonProperty("client_url")
    private String clientUrl;

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


    /**
     * The type of event. Can be `trigger`, `acknowledge` or `resolve`.
     */
    @AllArgsConstructor
    public enum EventActionEnum {
        TRIGGER("trigger"),
        ACKNOWLEDGE("acknowledge"),
        RESOLVE("resolve");

        private final String value;
    }

}
