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

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetPastIncidents200ResponsePastIncidentsInnerIncident
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
    "id",
    "created_at",
    "self",
    "title"
})
@JsonTypeName("getPastIncidents_200_response_past_incidents_inner_incident")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetPastIncidents200ResponsePastIncidentsInnerIncident {

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

    /**
     * Constructs a validated instance of {@link GetPastIncidents200ResponsePastIncidentsInnerIncident}.
     *
     * @param spec the specification to process
     */
    public GetPastIncidents200ResponsePastIncidentsInnerIncident(Consumer<GetPastIncidents200ResponsePastIncidentsInnerIncident> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link GetPastIncidents200ResponsePastIncidentsInnerIncident}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #GetPastIncidents200ResponsePastIncidentsInnerIncident(Consumer)} instead.
     * @param id The globally unique identifier of the incident
     * @param createdAt The date/time the incident was first triggered
     * @param self The URL at which the object is accessible
     * @param title The description of the nature, symptoms, cause, or effect of the incident
     */
    @ApiStatus.Internal
    public GetPastIncidents200ResponsePastIncidentsInnerIncident(String id, String createdAt, String self, String title) {
        this.id = id;
        this.createdAt = createdAt;
        this.self = self;
        this.title = title;
    }

}
