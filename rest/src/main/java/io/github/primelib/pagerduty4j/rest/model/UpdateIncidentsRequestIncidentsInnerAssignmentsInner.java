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
 * UpdateIncidentsRequestIncidentsInnerAssignmentsInner
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
    "assignee"
})
@JsonTypeName("updateIncidents_request_incidents_inner_assignments_inner")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UpdateIncidentsRequestIncidentsInnerAssignmentsInner {

    @JsonProperty("assignee")
    protected UserReference assignee;

    /**
     * Constructs a validated instance of {@link UpdateIncidentsRequestIncidentsInnerAssignmentsInner}.
     *
     * @param spec the specification to process
     */
    public UpdateIncidentsRequestIncidentsInnerAssignmentsInner(Consumer<UpdateIncidentsRequestIncidentsInnerAssignmentsInner> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link UpdateIncidentsRequestIncidentsInnerAssignmentsInner}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #UpdateIncidentsRequestIncidentsInnerAssignmentsInner(Consumer)} instead.
     * @param assignee var.name
     */
    @ApiStatus.Internal
    public UpdateIncidentsRequestIncidentsInnerAssignmentsInner(UserReference assignee) {
        this.assignee = assignee;
    }

}
