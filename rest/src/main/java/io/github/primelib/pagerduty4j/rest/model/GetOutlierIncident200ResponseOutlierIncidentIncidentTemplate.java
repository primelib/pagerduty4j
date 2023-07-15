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
 * GetOutlierIncident200ResponseOutlierIncidentIncidentTemplate
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "id",
    "cluster_id",
    "mined_text"
})
@JsonTypeName("getOutlierIncident_200_response_outlier_incident_incident_template")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetOutlierIncident200ResponseOutlierIncidentIncidentTemplate {

    /**
     * Constructs a validated implementation of {@link GetOutlierIncident200ResponseOutlierIncidentIncidentTemplate}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetOutlierIncident200ResponseOutlierIncidentIncidentTemplate(Consumer<GetOutlierIncident200ResponseOutlierIncidentIncidentTemplate> spec) {
        spec.accept(this);
    }

    @JsonProperty("id")
    protected String id;

    /**
     * The cluster the Incident Template pattern belongs to
     */
    @JsonProperty("cluster_id")
    protected String clusterId;

    /**
     * The Incident Template mined pattern text
     */
    @JsonProperty("mined_text")
    protected String minedText;


}
