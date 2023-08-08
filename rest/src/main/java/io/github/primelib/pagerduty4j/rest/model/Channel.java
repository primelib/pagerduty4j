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
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Channel
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

    /**
     * Constructs a validated instance of {@link Channel}.
     *
     * @param spec the specification to process
     */
    public Channel(Consumer<Channel> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link Channel}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #Channel(Consumer)} instead.
     * @param type type
     * @param user user
     * @param team team
     * @param notification notification
     * @param channel channel
     */
    @ApiStatus.Internal
    public Channel(String type, Object user, Object team, Notification notification, Object channel) {
        this.type = type;
        this.user = user;
        this.team = team;
        this.notification = notification;
        this.channel = channel;
    }

}
