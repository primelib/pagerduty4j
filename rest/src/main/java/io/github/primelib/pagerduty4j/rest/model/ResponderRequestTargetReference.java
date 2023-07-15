package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ResponderRequestTargetReference
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "type",
    "id",
    "summary",
    "incident_responders"
})
@JsonTypeName("ResponderRequestTargetReference")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ResponderRequestTargetReference {

    /**
     * The type of target (either a user or an escalation policy)
     */
    @JsonProperty("type")
    private String type;

    /**
     * The id of the user or escalation policy
     */
    @JsonProperty("id")
    private String id;

    @JsonProperty("summary")
    private String summary;

    /**
     * An array of responders associated with the specified incident
     */
    @JsonProperty("incident_responders")
    private List<IncidentsRespondersReference> incidentResponders;


}
