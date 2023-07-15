package io.github.primelib.pagerduty4j.rest.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CustomFieldsEditableFieldOption
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "id",
    "type",
    "created_at",
    "updated_at",
    "data"
})
@JsonTypeName("CustomFieldsEditableFieldOption")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CustomFieldsEditableFieldOption {

    /**
     * Constructs a validated implementation of {@link CustomFieldsEditableFieldOption}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public CustomFieldsEditableFieldOption(Consumer<CustomFieldsEditableFieldOption> spec) {
        spec.accept(this);
    }

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


    @AllArgsConstructor
    public enum TypeEnum {
        FIELD_OPTION("field_option");

        private final String value;
    }

}
