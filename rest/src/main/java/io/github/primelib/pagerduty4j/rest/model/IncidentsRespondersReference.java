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
 * IncidentsRespondersReference
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "state",
    "user",
    "incident",
    "updated_at",
    "message",
    "requester",
    "requested_at"
})
@JsonTypeName("IncidentsRespondersReference")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IncidentsRespondersReference {

    /**
     * Constructs a validated implementation of {@link IncidentsRespondersReference}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public IncidentsRespondersReference(Consumer<IncidentsRespondersReference> spec) {
        spec.accept(this);
    }

    /**
     * The status of the responder being added to the incident
     */
    @JsonProperty("state")
    protected String state;

    @JsonProperty("user")
    protected UserReference user;

    @JsonProperty("incident")
    protected IncidentReference incident;

    @JsonProperty("updated_at")
    protected String updatedAt;

    /**
     * The message sent with the responder request
     */
    @JsonProperty("message")
    protected String message;

    @JsonProperty("requester")
    protected UserReference requester;

    @JsonProperty("requested_at")
    protected String requestedAt;


}
