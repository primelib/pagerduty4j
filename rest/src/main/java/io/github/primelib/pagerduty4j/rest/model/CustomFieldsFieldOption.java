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

import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * CustomFieldsFieldOption
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
    "type",
    "created_at",
    "updated_at",
    "data"
})
@JsonTypeName("CustomFieldsFieldOption")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CustomFieldsFieldOption {

    /**
     * The ID of the resource.
     */
    @JsonProperty("id")
    protected String id;

    @JsonProperty("type")
    protected TypeEnum type;

    /**
     * The date/time the object was created at.
     */
    @JsonProperty("created_at")
    protected OffsetDateTime createdAt;

    /**
     * The date/time the object was last updated.
     */
    @JsonProperty("updated_at")
    protected OffsetDateTime updatedAt;

    @JsonProperty("data")
    protected CustomFieldsEditableFieldOptionData data;

    /**
     * Constructs a validated instance of {@link CustomFieldsFieldOption}.
     *
     * @param spec the specification to process
     */
    public CustomFieldsFieldOption(Consumer<CustomFieldsFieldOption> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link CustomFieldsFieldOption}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #CustomFieldsFieldOption(Consumer)} instead.
     * @param id The ID of the resource.
     * @param type type
     * @param createdAt The date/time the object was created at.
     * @param updatedAt The date/time the object was last updated.
     * @param data data
     */
    @ApiStatus.Internal
    public CustomFieldsFieldOption(String id, TypeEnum type, OffsetDateTime createdAt, OffsetDateTime updatedAt, CustomFieldsEditableFieldOptionData data) {
        this.id = id;
        this.type = type;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.data = data;
    }

    @AllArgsConstructor
    public enum TypeEnum {
        FIELD_OPTION("field_option");

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
