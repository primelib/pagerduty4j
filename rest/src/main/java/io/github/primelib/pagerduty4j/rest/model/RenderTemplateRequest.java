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
 * RenderTemplateRequest
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "incident_id",
    "status_update",
    "external"
})
@JsonTypeName("renderTemplate_request")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class RenderTemplateRequest {

    /**
     * Constructs a validated implementation of {@link RenderTemplateRequest}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public RenderTemplateRequest(Consumer<RenderTemplateRequest> spec) {
        spec.accept(this);
    }

    /**
     * The incident id to render the template for
     */
    @JsonProperty("incident_id")
    protected String incidentId;

    @JsonProperty("status_update")
    protected StatusUpdateTemplateInputStatusUpdate statusUpdate;

    /**
     * An optional object collection that can be referenced in the template.
     */
    @JsonProperty("external")
    protected Object external = null;


}
