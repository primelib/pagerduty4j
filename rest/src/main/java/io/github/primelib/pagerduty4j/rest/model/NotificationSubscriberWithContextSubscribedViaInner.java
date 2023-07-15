package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * NotificationSubscriberWithContextSubscribedViaInner
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "id",
    "name"
})
@JsonTypeName("NotificationSubscriberWithContext_subscribed_via_inner")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class NotificationSubscriberWithContextSubscribedViaInner {

    /**
     * The id of the object this subscriber is subscribed via
     */
    @JsonProperty("id")
    private String id;

    /**
     * The type of the object this subscriber is subscribed via
     */
    @JsonProperty("name")
    private String name;


}
