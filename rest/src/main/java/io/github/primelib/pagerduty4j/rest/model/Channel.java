package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Channel
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
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
    private String type;

    @JsonProperty("user")
    private Object user;

    @JsonProperty("team")
    private Object team;

    @JsonProperty("notification")
    private Notification notification;

    /**
     * channel
     */
    @JsonProperty("channel")
    private Object channel;


}
