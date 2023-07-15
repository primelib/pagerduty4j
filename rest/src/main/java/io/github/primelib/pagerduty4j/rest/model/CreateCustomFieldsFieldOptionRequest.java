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
 * CreateCustomFieldsFieldOptionRequest
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "field_option"
})
@JsonTypeName("createCustomFieldsFieldOption_request")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateCustomFieldsFieldOptionRequest {

    /**
     * Constructs a validated implementation of {@link CreateCustomFieldsFieldOptionRequest}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public CreateCustomFieldsFieldOptionRequest(Consumer<CreateCustomFieldsFieldOptionRequest> spec) {
        spec.accept(this);
    }

    @JsonProperty("field_option")
    protected CustomFieldsFieldOption fieldOption;


}
