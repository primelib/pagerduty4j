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
 * ListCustomFieldsFields200Response
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
    "fields"
})
@JsonTypeName("listCustomFieldsFields_200_response")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ListCustomFieldsFields200Response {

    @JsonProperty("fields")
    protected List<CustomFieldsFieldWithOptions> fields;

    /**
     * Constructs a validated instance of {@link ListCustomFieldsFields200Response}.
     *
     * @param spec the specification to process
     */
    public ListCustomFieldsFields200Response(Consumer<ListCustomFieldsFields200Response> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ListCustomFieldsFields200Response}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ListCustomFieldsFields200Response(Consumer)} instead.
     * @param fields fields
     */
    @ApiStatus.Internal
    public ListCustomFieldsFields200Response(List<CustomFieldsFieldWithOptions> fields) {
        this.fields = fields;
    }

}
