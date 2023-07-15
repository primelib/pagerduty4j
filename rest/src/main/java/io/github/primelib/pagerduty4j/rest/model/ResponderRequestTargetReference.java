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
 * ResponderRequestTargetReference
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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
     * Constructs a validated implementation of {@link ResponderRequestTargetReference}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ResponderRequestTargetReference(Consumer<ResponderRequestTargetReference> spec) {
        spec.accept(this);
    }

    /**
     * The type of target (either a user or an escalation policy)
     */
    @JsonProperty("type")
    protected String type;

    /**
     * The id of the user or escalation policy
     */
    @JsonProperty("id")
    protected String id;

    @JsonProperty("summary")
    protected String summary;

    /**
     * An array of responders associated with the specified incident
     */
    @JsonProperty("incident_responders")
    protected List<IncidentsRespondersReference> incidentResponders;


}
