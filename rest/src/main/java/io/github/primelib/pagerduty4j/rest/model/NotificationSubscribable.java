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
import lombok.AllArgsConstructor;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * NotificationSubscribable
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
    "subscribable_id",
    "subscribable_type"
})
@JsonTypeName("NotificationSubscribable")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class NotificationSubscribable {

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
     * Constructs a validated instance of {@link NotificationSubscribable}.
     *
     * @param spec the specification to process
     */
    public NotificationSubscribable(Consumer<NotificationSubscribable> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link NotificationSubscribable}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #NotificationSubscribable(Consumer)} instead.
     * @param subscribableId The ID of the entity to subscribe to
     * @param subscribableType The type of the entity being subscribed to
     */
    @ApiStatus.Internal
    public NotificationSubscribable(String subscribableId, SubscribableTypeEnum subscribableType) {
        this.subscribableId = subscribableId;
        this.subscribableType = subscribableType;
    }

    /**
     * The type of the entity being subscribed to
     */
    @AllArgsConstructor
    public enum SubscribableTypeEnum {
        INCIDENT("incident"),
        BUSINESS_SERVICE("business_service");

        private static final SubscribableTypeEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static SubscribableTypeEnum of(String input) {
            if (input != null) {
                for (SubscribableTypeEnum v : VALUES) {
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
