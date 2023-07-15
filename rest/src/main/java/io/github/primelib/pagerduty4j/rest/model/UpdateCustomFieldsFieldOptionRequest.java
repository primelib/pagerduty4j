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
 * UpdateCustomFieldsFieldOptionRequest
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "field_option"
})
@JsonTypeName("updateCustomFieldsFieldOption_request")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UpdateCustomFieldsFieldOptionRequest {

    /**
     * Constructs a validated implementation of {@link UpdateCustomFieldsFieldOptionRequest}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public UpdateCustomFieldsFieldOptionRequest(Consumer<UpdateCustomFieldsFieldOptionRequest> spec) {
        spec.accept(this);
    }

    @JsonProperty("field_option")
    protected CustomFieldsEditableFieldOption fieldOption;


}
