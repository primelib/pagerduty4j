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
 * UpdateIncidentRequest
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
    "incident"
})
@JsonTypeName("updateIncident_request")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UpdateIncidentRequest {

    @JsonProperty("incident")
    protected UpdateIncidentRequestIncident incident;

    /**
     * Constructs a validated instance of {@link UpdateIncidentRequest}.
     *
     * @param spec the specification to process
     */
    public UpdateIncidentRequest(Consumer<UpdateIncidentRequest> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link UpdateIncidentRequest}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #UpdateIncidentRequest(Consumer)} instead.
     * @param incident incident
     */
    @ApiStatus.Internal
    public UpdateIncidentRequest(UpdateIncidentRequestIncident incident) {
        this.incident = incident;
    }

}
