package io.github.primelib.pagerduty4j.rest.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ListCustomFieldsFieldOptions200Response
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "field_options"
})
@JsonTypeName("listCustomFieldsFieldOptions_200_response")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ListCustomFieldsFieldOptions200Response {

    /**
     * Constructs a validated implementation of {@link ListCustomFieldsFieldOptions200Response}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ListCustomFieldsFieldOptions200Response(Consumer<ListCustomFieldsFieldOptions200Response> spec) {
        spec.accept(this);
    }

    @JsonProperty("field_options")
    protected List<CustomFieldsFieldOption> fieldOptions = new ArrayList<>();


}
