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
 * Impact
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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

    /**
     * Constructs a validated implementation of {@link Impact}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public Impact(Consumer<Impact> spec) {
        spec.accept(this);
    }

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
