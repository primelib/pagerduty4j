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
 * CustomFieldsEditableFieldOptionData
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
    "data_type",
    "value"
})
@JsonTypeName("CustomFieldsEditableFieldOption_data")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CustomFieldsEditableFieldOptionData {

    /**
     * The kind of data represented by this option. Must match the Field's {@code data_type}.
     */
    @JsonProperty("data_type")
    protected DataTypeEnum dataType;

    @JsonProperty("value")
    protected String value;

    /**
     * Constructs a validated instance of {@link CustomFieldsEditableFieldOptionData}.
     *
     * @param spec the specification to process
     */
    public CustomFieldsEditableFieldOptionData(Consumer<CustomFieldsEditableFieldOptionData> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link CustomFieldsEditableFieldOptionData}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #CustomFieldsEditableFieldOptionData(Consumer)} instead.
     * @param dataType The kind of data represented by this option. Must match the Field's {@code data_type}.
     * @param value var.name
     */
    @ApiStatus.Internal
    public CustomFieldsEditableFieldOptionData(DataTypeEnum dataType, String value) {
        this.dataType = dataType;
        this.value = value;
    }

    /**
     * The kind of data represented by this option. Must match the Field's {@code data_type}.
     */
    @AllArgsConstructor
    public enum DataTypeEnum {
        STRING("string");

        private static final DataTypeEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static DataTypeEnum of(String input) {
            if (input != null) {
                for (DataTypeEnum v : VALUES) {
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
