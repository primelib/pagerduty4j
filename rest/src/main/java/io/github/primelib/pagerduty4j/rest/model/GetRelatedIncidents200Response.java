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
 * GetRelatedIncidents200Response
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
    "related_incidents"
})
@JsonTypeName("getRelatedIncidents_200_response")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetRelatedIncidents200Response {

    /**
     * A list of Related Incidents and their relationships.
     */
    @JsonProperty("related_incidents")
    protected List<GetRelatedIncidents200ResponseRelatedIncidentsInner> relatedIncidents;

    /**
     * Constructs a validated instance of {@link GetRelatedIncidents200Response}.
     *
     * @param spec the specification to process
     */
    public GetRelatedIncidents200Response(Consumer<GetRelatedIncidents200Response> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link GetRelatedIncidents200Response}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #GetRelatedIncidents200Response(Consumer)} instead.
     * @param relatedIncidents A list of Related Incidents and their relationships.
     */
    @ApiStatus.Internal
    public GetRelatedIncidents200Response(List<GetRelatedIncidents200ResponseRelatedIncidentsInner> relatedIncidents) {
        this.relatedIncidents = relatedIncidents;
    }

}
