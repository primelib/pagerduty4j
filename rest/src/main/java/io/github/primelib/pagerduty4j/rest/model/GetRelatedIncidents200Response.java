package io.github.primelib.pagerduty4j.rest.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetRelatedIncidents200Response
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "related_incidents"
})
@JsonTypeName("getRelatedIncidents_200_response")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetRelatedIncidents200Response {

    /**
     * Constructs a validated implementation of {@link GetRelatedIncidents200Response}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetRelatedIncidents200Response(Consumer<GetRelatedIncidents200Response> spec) {
        spec.accept(this);
    }

    /**
     * A list of Related Incidents and their relationships.
     */
    @JsonProperty("related_incidents")
    protected List<GetRelatedIncidents200ResponseRelatedIncidentsInner> relatedIncidents;


}
