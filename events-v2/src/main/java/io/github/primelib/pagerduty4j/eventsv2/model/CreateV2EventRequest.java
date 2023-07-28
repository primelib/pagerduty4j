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
import lombok.AllArgsConstructor;
import lombok.experimental.Accessors;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * CreateV2EventRequest
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
    protected Payload payload;

    /**
     * The GUID of one of your Events API V2 integrations. This is the "Integration Key" listed on the Events API V2 integration's detail page.
     */
    @JsonProperty("routing_key")
    protected String routingKey;

    /**
     * The type of event. Can be {@code trigger}, {@code acknowledge} or {@code resolve}.
     */
    @JsonProperty("event_action")
    protected EventActionEnum eventAction;

    /**
     * Identifies the alert to {@code trigger}, {@code acknowledge}, or {@code resolve}. Required unless the {@code event_type} is {@code trigger}.
     */
    @JsonProperty("dedup_key")
    protected String dedupKey;

    /**
     * The name of the monitoring client that is triggering this event. (This field is only used for {@code trigger} events.)
     */
    @JsonProperty("client")
    protected String client;

    /**
     * The URL of the monitoring client that is triggering this event. (This field is only used for {@code trigger} events.)
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
     * Constructs a validated instance of {@link CreateV2EventRequest}.
     *
     * @param spec the specification to process
     */
    public CreateV2EventRequest(Consumer<CreateV2EventRequest> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link CreateV2EventRequest}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #CreateV2EventRequest(Consumer)} instead.
     * @param payload var.name
     * @param routingKey The GUID of one of your Events API V2 integrations. This is the "Integration Key" listed on the Events API V2 integration's detail page.
     * @param eventAction The type of event. Can be {@code trigger}, {@code acknowledge} or {@code resolve}.
     * @param dedupKey Identifies the alert to {@code trigger}, {@code acknowledge}, or {@code resolve}. Required unless the {@code event_type} is {@code trigger}.
     * @param client The name of the monitoring client that is triggering this event. (This field is only used for {@code trigger} events.)
     * @param clientUrl The URL of the monitoring client that is triggering this event. (This field is only used for {@code trigger} events.)
     * @param links Links to be shown on the alert and/or corresponding incident.
     * @param images Images to be displayed on the alert and/or corresponding incident.
     */
    @ApiStatus.Internal
    public CreateV2EventRequest(Payload payload, String routingKey, EventActionEnum eventAction, String dedupKey, String client, String clientUrl, List<LinksInner> links, List<ImagesInner> images) {
        this.payload = payload;
        this.routingKey = routingKey;
        this.eventAction = eventAction;
        this.dedupKey = dedupKey;
        this.client = client;
        this.clientUrl = clientUrl;
        this.links = links;
        this.images = images;
    }

    /**
     * The type of event. Can be {@code trigger}, {@code acknowledge} or {@code resolve}.
     */
    @AllArgsConstructor
    public enum EventActionEnum {
        TRIGGER("trigger"),
        ACKNOWLEDGE("acknowledge"),
        RESOLVE("resolve");

        private static final EventActionEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static EventActionEnum of(String input) {
            if (input != null) {
                for (EventActionEnum v : VALUES) {
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
