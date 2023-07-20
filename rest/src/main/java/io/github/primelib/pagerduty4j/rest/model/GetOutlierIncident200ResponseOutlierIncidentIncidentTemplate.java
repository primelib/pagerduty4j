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
 * GetOutlierIncident200ResponseOutlierIncidentIncidentTemplate
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
    "cluster_id",
    "mined_text"
})
@JsonTypeName("getOutlierIncident_200_response_outlier_incident_incident_template")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetOutlierIncident200ResponseOutlierIncidentIncidentTemplate {

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

    /**
     * Constructs a validated instance of {@link GetOutlierIncident200ResponseOutlierIncidentIncidentTemplate}.
     *
     * @param spec the specification to process
     */
    public GetOutlierIncident200ResponseOutlierIncidentIncidentTemplate(Consumer<GetOutlierIncident200ResponseOutlierIncidentIncidentTemplate> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link GetOutlierIncident200ResponseOutlierIncidentIncidentTemplate}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #GetOutlierIncident200ResponseOutlierIncidentIncidentTemplate(Consumer)} instead.
     * @param id var.name
     * @param clusterId The cluster the Incident Template pattern belongs to
     * @param minedText The Incident Template mined pattern text
     */
    @ApiStatus.Internal
    public GetOutlierIncident200ResponseOutlierIncidentIncidentTemplate(String id, String clusterId, String minedText) {
        this.id = id;
        this.clusterId = clusterId;
        this.minedText = minedText;
    }

}
