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
 * CreateV2EventRequest
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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

    /**
     * Constructs a validated implementation of {@link CreateV2EventRequest}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public CreateV2EventRequest(Consumer<CreateV2EventRequest> spec) {
        spec.accept(this);
    }

    @JsonProperty("payload")
    protected Payload payload;

    /**
     * The GUID of one of your Events API V2 integrations. This is the "Integration Key" listed on the Events API V2 integration's detail page.
     */
    @JsonProperty("routing_key")
    protected String routingKey;

    /**
     * The type of event. Can be `trigger`, `acknowledge` or `resolve`.
     */
    @JsonProperty("event_action")
    protected EventActionEnum eventAction;

    /**
     * Identifies the alert to `trigger`, `acknowledge`, or `resolve`. Required unless the `event_type` is `trigger`.
     */
    @JsonProperty("dedup_key")
    protected String dedupKey;

    /**
     * The name of the monitoring client that is triggering this event. (This field is only used for `trigger` events.)
     */
    @JsonProperty("client")
    protected String client;

    /**
     * The URL of the monitoring client that is triggering this event. (This field is only used for `trigger` events.)
     */
    @JsonProperty("client_url")
    protected String clientUrl;

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
