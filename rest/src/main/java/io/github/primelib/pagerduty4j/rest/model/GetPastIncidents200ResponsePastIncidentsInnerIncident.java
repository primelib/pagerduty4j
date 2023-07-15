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
 * GetPastIncidents200ResponsePastIncidentsInnerIncident
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "id",
    "created_at",
    "self",
    "title"
})
@JsonTypeName("getPastIncidents_200_response_past_incidents_inner_incident")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetPastIncidents200ResponsePastIncidentsInnerIncident {

    /**
     * Constructs a validated implementation of {@link GetPastIncidents200ResponsePastIncidentsInnerIncident}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetPastIncidents200ResponsePastIncidentsInnerIncident(Consumer<GetPastIncidents200ResponsePastIncidentsInnerIncident> spec) {
        spec.accept(this);
    }

    /**
     * The globally unique identifier of the incident
     */
    @JsonProperty("id")
    protected String id;

    /**
     * The date/time the incident was first triggered
     */
    @JsonProperty("created_at")
    protected String createdAt;

    /**
     * The URL at which the object is accessible
     */
    @JsonProperty("self")
    protected String self;

    /**
     * The description of the nature, symptoms, cause, or effect of the incident
     */
    @JsonProperty("title")
    protected String title;


}
