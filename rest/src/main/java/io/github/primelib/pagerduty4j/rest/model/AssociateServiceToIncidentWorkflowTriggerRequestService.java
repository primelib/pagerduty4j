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
 * AssociateServiceToIncidentWorkflowTriggerRequestService
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
    "id"
})
@JsonTypeName("associateServiceToIncidentWorkflowTrigger_request_service")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AssociateServiceToIncidentWorkflowTriggerRequestService {

    @JsonProperty("id")
    protected String id;

    /**
     * Constructs a validated instance of {@link AssociateServiceToIncidentWorkflowTriggerRequestService}.
     *
     * @param spec the specification to process
     */
    public AssociateServiceToIncidentWorkflowTriggerRequestService(Consumer<AssociateServiceToIncidentWorkflowTriggerRequestService> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link AssociateServiceToIncidentWorkflowTriggerRequestService}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #AssociateServiceToIncidentWorkflowTriggerRequestService(Consumer)} instead.
     * @param id id
     */
    @ApiStatus.Internal
    public AssociateServiceToIncidentWorkflowTriggerRequestService(String id) {
        this.id = id;
    }

}
