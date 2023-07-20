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
 * UpdateIncidentsRequest
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
    "incidents"
})
@JsonTypeName("updateIncidents_request")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UpdateIncidentsRequest {

    /**
     * An array of incidents, including the parameters to update.
     */
    @JsonProperty("incidents")
    protected List<UpdateIncidentsRequestIncidentsInner> incidents;

    /**
     * Constructs a validated instance of {@link UpdateIncidentsRequest}.
     *
     * @param spec the specification to process
     */
    public UpdateIncidentsRequest(Consumer<UpdateIncidentsRequest> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link UpdateIncidentsRequest}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #UpdateIncidentsRequest(Consumer)} instead.
     * @param incidents An array of incidents, including the parameters to update.
     */
    @ApiStatus.Internal
    public UpdateIncidentsRequest(List<UpdateIncidentsRequestIncidentsInner> incidents) {
        this.incidents = incidents;
    }

}
