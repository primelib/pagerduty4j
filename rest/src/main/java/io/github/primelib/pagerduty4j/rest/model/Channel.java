package io.github.primelib.pagerduty4j.rest.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Channel
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "type",
    "user",
    "team",
    "notification",
    "channel"
})
@JsonTypeName("Channel")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Channel {

    /**
     * Constructs a validated implementation of {@link Channel}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public Channel(Consumer<Channel> spec) {
        spec.accept(this);
    }

    /**
     * type
     */
    @JsonProperty("type")
    protected String type;

    @JsonProperty("user")
    protected Object user;

    @JsonProperty("team")
    protected Object team;

    @JsonProperty("notification")
    protected Notification notification;

    /**
     * channel
     */
    @JsonProperty("channel")
    protected Object channel;


}
