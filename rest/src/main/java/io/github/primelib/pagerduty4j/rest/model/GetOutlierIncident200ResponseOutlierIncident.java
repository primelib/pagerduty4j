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
 * GetOutlierIncident200ResponseOutlierIncident
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
    "incident",
    "incident_template"
})
@JsonTypeName("getOutlierIncident_200_response_outlier_incident")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetOutlierIncident200ResponseOutlierIncident {

    @JsonProperty("incident")
    protected Incident incident;

    @JsonProperty("incident_template")
    protected GetOutlierIncident200ResponseOutlierIncidentIncidentTemplate incidentTemplate;

    /**
     * Constructs a validated instance of {@link GetOutlierIncident200ResponseOutlierIncident}.
     *
     * @param spec the specification to process
     */
    public GetOutlierIncident200ResponseOutlierIncident(Consumer<GetOutlierIncident200ResponseOutlierIncident> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link GetOutlierIncident200ResponseOutlierIncident}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #GetOutlierIncident200ResponseOutlierIncident(Consumer)} instead.
     * @param incident incident
     * @param incidentTemplate incidentTemplate
     */
    @ApiStatus.Internal
    public GetOutlierIncident200ResponseOutlierIncident(Incident incident, GetOutlierIncident200ResponseOutlierIncidentIncidentTemplate incidentTemplate) {
        this.incident = incident;
        this.incidentTemplate = incidentTemplate;
    }

}
