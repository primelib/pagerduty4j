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
 * UpdateIncidentsRequestIncidentsInnerAssignmentsInner
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "assignee"
})
@JsonTypeName("updateIncidents_request_incidents_inner_assignments_inner")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UpdateIncidentsRequestIncidentsInnerAssignmentsInner {

    /**
     * Constructs a validated implementation of {@link UpdateIncidentsRequestIncidentsInnerAssignmentsInner}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public UpdateIncidentsRequestIncidentsInnerAssignmentsInner(Consumer<UpdateIncidentsRequestIncidentsInnerAssignmentsInner> spec) {
        spec.accept(this);
    }

    @JsonProperty("assignee")
    protected UserReference assignee;


}
