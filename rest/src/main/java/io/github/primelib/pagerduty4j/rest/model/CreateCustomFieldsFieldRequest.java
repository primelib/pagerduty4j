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
 * CreateCustomFieldsFieldRequest
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "field"
})
@JsonTypeName("createCustomFieldsField_request")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateCustomFieldsFieldRequest {

    /**
     * Constructs a validated implementation of {@link CreateCustomFieldsFieldRequest}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public CreateCustomFieldsFieldRequest(Consumer<CreateCustomFieldsFieldRequest> spec) {
        spec.accept(this);
    }

    @JsonProperty("field")
    protected CustomFieldsFieldWithOptions field;


}
