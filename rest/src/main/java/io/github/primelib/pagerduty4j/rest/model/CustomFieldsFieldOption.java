package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CustomFieldsFieldOption
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
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
    private String id;

    @JsonProperty("type")
    private TypeEnum type;

    /**
     * The date/time the object was created at.
     */
    @JsonProperty("created_at")
    private OffsetDateTime createdAt;

    /**
     * The date/time the object was last updated.
     */
    @JsonProperty("updated_at")
    private OffsetDateTime updatedAt;

    @JsonProperty("data")
    private CustomFieldsEditableFieldOptionData data;


    @AllArgsConstructor
    public enum TypeEnum {
        FIELD_OPTION("field_option");

        private final String value;
    }

}
