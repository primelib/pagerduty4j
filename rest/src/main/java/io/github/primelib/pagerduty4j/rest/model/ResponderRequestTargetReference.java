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
 * ResponderRequestTargetReference
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

    /**
     * Constructs a validated instance of {@link ResponderRequestTargetReference}.
     *
     * @param spec the specification to process
     */
    public ResponderRequestTargetReference(Consumer<ResponderRequestTargetReference> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ResponderRequestTargetReference}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ResponderRequestTargetReference(Consumer)} instead.
     * @param type The type of target (either a user or an escalation policy)
     * @param id The id of the user or escalation policy
     * @param summary summary
     * @param incidentResponders An array of responders associated with the specified incident
     */
    @ApiStatus.Internal
    public ResponderRequestTargetReference(String type, String id, String summary, List<IncidentsRespondersReference> incidentResponders) {
        this.type = type;
        this.id = id;
        this.summary = summary;
        this.incidentResponders = incidentResponders;
    }

}
