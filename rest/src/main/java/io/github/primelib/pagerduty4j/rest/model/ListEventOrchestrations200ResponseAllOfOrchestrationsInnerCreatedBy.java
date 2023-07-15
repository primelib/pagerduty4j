package io.github.primelib.pagerduty4j.rest.model;

import java.util.List;
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
 * ListEventOrchestrations200ResponseAllOfOrchestrationsInnerCreatedBy
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "id",
    "type",
    "self"
})
@JsonTypeName("listEventOrchestrations_200_response_allOf_orchestrations_inner_created_by")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ListEventOrchestrations200ResponseAllOfOrchestrationsInnerCreatedBy {

    /**
     * Constructs a validated implementation of {@link ListEventOrchestrations200ResponseAllOfOrchestrationsInnerCreatedBy}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ListEventOrchestrations200ResponseAllOfOrchestrationsInnerCreatedBy(Consumer<ListEventOrchestrations200ResponseAllOfOrchestrationsInnerCreatedBy> spec) {
        spec.accept(this);
    }

    @JsonProperty("id")
    protected String id;

    /**
     * A string that determines the schema of the object
     */
    @JsonProperty("type")
    protected String type;

    /**
     * The API show URL at which the object is accessible
     */
    @JsonProperty("self")
    protected String self;


}
