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
import lombok.experimental.Accessors;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ListCustomFieldsFieldOptions200Response
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
    "field_options"
})
@JsonTypeName("listCustomFieldsFieldOptions_200_response")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ListCustomFieldsFieldOptions200Response {

    @JsonProperty("field_options")
    protected List<CustomFieldsFieldOption> fieldOptions;

    /**
     * Constructs a validated instance of {@link ListCustomFieldsFieldOptions200Response}.
     *
     * @param spec the specification to process
     */
    public ListCustomFieldsFieldOptions200Response(Consumer<ListCustomFieldsFieldOptions200Response> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ListCustomFieldsFieldOptions200Response}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ListCustomFieldsFieldOptions200Response(Consumer)} instead.
     * @param fieldOptions fieldOptions
     */
    @ApiStatus.Internal
    public ListCustomFieldsFieldOptions200Response(List<CustomFieldsFieldOption> fieldOptions) {
        this.fieldOptions = fieldOptions;
    }

}
