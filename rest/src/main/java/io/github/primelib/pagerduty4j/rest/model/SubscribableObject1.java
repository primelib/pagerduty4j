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
 * SubscribableObject1
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
    "id",
    "type"
})
@JsonTypeName("SubscribableObject_1")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class SubscribableObject1 {

    /**
     * The ID of the subscribed entity.
     */
    @JsonProperty("id")
    protected String id;

    /**
     * The type of the subscribed entity.
     */
    @JsonProperty("type")
    protected TypeEnum type;

    /**
     * Constructs a validated instance of {@link SubscribableObject1}.
     *
     * @param spec the specification to process
     */
    public SubscribableObject1(Consumer<SubscribableObject1> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link SubscribableObject1}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #SubscribableObject1(Consumer)} instead.
     * @param id The ID of the subscribed entity.
     * @param type The type of the subscribed entity.
     */
    @ApiStatus.Internal
    public SubscribableObject1(String id, TypeEnum type) {
        this.id = id;
        this.type = type;
    }

    /**
     * The type of the subscribed entity.
     */
    @AllArgsConstructor
    public enum TypeEnum {
        PAGE("status_page"),
        PAGE_SERVICE("status_page_service"),
        PAGE_POST("status_page_post");

        private static final TypeEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static TypeEnum of(String input) {
            if (input != null) {
                for (TypeEnum v : VALUES) {
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
