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
 * IncidentsRespondersReference
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

    /**
     * Constructs a validated instance of {@link IncidentsRespondersReference}.
     *
     * @param spec the specification to process
     */
    public IncidentsRespondersReference(Consumer<IncidentsRespondersReference> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link IncidentsRespondersReference}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #IncidentsRespondersReference(Consumer)} instead.
     * @param state The status of the responder being added to the incident
     * @param user user
     * @param incident incident
     * @param updatedAt updatedAt
     * @param message The message sent with the responder request
     * @param requester requester
     * @param requestedAt requestedAt
     */
    @ApiStatus.Internal
    public IncidentsRespondersReference(String state, UserReference user, IncidentReference incident, String updatedAt, String message, UserReference requester, String requestedAt) {
        this.state = state;
        this.user = user;
        this.incident = incident;
        this.updatedAt = updatedAt;
        this.message = message;
        this.requester = requester;
        this.requestedAt = requestedAt;
    }

}
