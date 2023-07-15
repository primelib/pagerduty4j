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
 * PutIncidentManualBusinessServiceAssociationRequest
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "relation"
})
@JsonTypeName("putIncidentManualBusinessServiceAssociation_request")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class PutIncidentManualBusinessServiceAssociationRequest {

    /**
     * Constructs a validated implementation of {@link PutIncidentManualBusinessServiceAssociationRequest}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public PutIncidentManualBusinessServiceAssociationRequest(Consumer<PutIncidentManualBusinessServiceAssociationRequest> spec) {
        spec.accept(this);
    }

    @JsonProperty("relation")
    protected RelationEnum relation;


    @AllArgsConstructor
    public enum RelationEnum {
        IMPACTED("impacted"),
        NOT_IMPACTED("not_impacted");

        private final String value;
    }

}
