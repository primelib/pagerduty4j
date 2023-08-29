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
 * Impact
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
    "name",
    "type",
    "status",
    "additional_fields"
})
@JsonTypeName("Impact")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Impact {

    @JsonProperty("id")
    protected String id;

    @JsonProperty("name")
    protected String name;

    /**
     * The kind of object that has been impacted
     */
    @JsonProperty("type")
    protected TypeEnum type;

    /**
     * The current impact status of the object
     */
    @JsonProperty("status")
    protected StatusEnum status;

    @JsonProperty("additional_fields")
    protected ImpactAdditionalFields additionalFields;

    /**
     * Constructs a validated instance of {@link Impact}.
     *
     * @param spec the specification to process
     */
    public Impact(Consumer<Impact> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link Impact}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #Impact(Consumer)} instead.
     * @param id id
     * @param name name
     * @param type The kind of object that has been impacted
     * @param status The current impact status of the object
     * @param additionalFields additionalFields
     */
    @ApiStatus.Internal
    public Impact(String id, String name, TypeEnum type, StatusEnum status, ImpactAdditionalFields additionalFields) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.status = status;
        this.additionalFields = additionalFields;
    }

    /**
     * The kind of object that has been impacted
     */
    @AllArgsConstructor
    public enum TypeEnum {
        BUSINESS_SERVICE("business_service");

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

    /**
     * The current impact status of the object
     */
    @AllArgsConstructor
    public enum StatusEnum {
        IMPACTED("impacted"),
        NOT_IMPACTED("not_impacted");

        private static final StatusEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static StatusEnum of(String input) {
            if (input != null) {
                for (StatusEnum v : VALUES) {
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
