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
 * NotificationSubscribable
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "subscribable_id",
    "subscribable_type"
})
@JsonTypeName("NotificationSubscribable")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class NotificationSubscribable {

    /**
     * Constructs a validated implementation of {@link NotificationSubscribable}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public NotificationSubscribable(Consumer<NotificationSubscribable> spec) {
        spec.accept(this);
    }

    /**
     * The ID of the entity to subscribe to
     */
    @JsonProperty("subscribable_id")
    protected String subscribableId;

    /**
     * The type of the entity being subscribed to
     */
    @JsonProperty("subscribable_type")
    protected SubscribableTypeEnum subscribableType;


    /**
     * The type of the entity being subscribed to
     */
    @AllArgsConstructor
    public enum SubscribableTypeEnum {
        INCIDENT("incident"),
        BUSINESS_SERVICE("business_service");

        private final String value;
    }

}
