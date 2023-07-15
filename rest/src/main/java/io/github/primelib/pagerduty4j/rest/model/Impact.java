package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Impact
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
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
    private String id;

    @JsonProperty("name")
    private String name;

    /**
     * The kind of object that has been impacted
     */
    @JsonProperty("type")
    private TypeEnum type;

    /**
     * The current impact status of the object
     */
    @JsonProperty("status")
    private StatusEnum status;

    @JsonProperty("additional_fields")
    private ImpactAdditionalFields additionalFields;


    /**
     * The kind of object that has been impacted
     */
    @AllArgsConstructor
    public enum TypeEnum {
        BUSINESS_SERVICE("business_service");

        private final String value;
    }

    /**
     * The current impact status of the object
     */
    @AllArgsConstructor
    public enum StatusEnum {
        IMPACTED("impacted"),
        NOT_IMPACTED("not_impacted");

        private final String value;
    }

}
