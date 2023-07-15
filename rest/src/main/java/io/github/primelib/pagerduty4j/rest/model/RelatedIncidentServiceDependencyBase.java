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
 * RelatedIncidentServiceDependencyBase
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "id",
    "type",
    "self"
})
@JsonTypeName("RelatedIncidentServiceDependencyBase")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class RelatedIncidentServiceDependencyBase {

    /**
     * Constructs a validated implementation of {@link RelatedIncidentServiceDependencyBase}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public RelatedIncidentServiceDependencyBase(Consumer<RelatedIncidentServiceDependencyBase> spec) {
        spec.accept(this);
    }

    /**
     * The ID of the Service referenced.
     */
    @JsonProperty("id")
    protected String id;

    /**
     * The type of the related Service.
     */
    @JsonProperty("type")
    protected TypeEnum type;

    /**
     * The API show URL at which the object is accessible.
     */
    @JsonProperty("self")
    protected String self;


    /**
     * The type of the related Service.
     */
    @AllArgsConstructor
    public enum TypeEnum {
        BUSINESS_SERVICE_REFERENCE("business_service_reference"),
        TECHNICAL_SERVICE_REFERENCE("technical_service_reference");

        private final String value;
    }

}
