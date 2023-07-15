package io.github.primelib.pagerduty4j.rest.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateOrchPathGlobal200Response
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "orchestration_path",
    "warnings"
})
@JsonTypeName("updateOrchPathGlobal_200_response")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UpdateOrchPathGlobal200Response {

    /**
     * Constructs a validated implementation of {@link UpdateOrchPathGlobal200Response}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public UpdateOrchPathGlobal200Response(Consumer<UpdateOrchPathGlobal200Response> spec) {
        spec.accept(this);
    }

    @JsonProperty("orchestration_path")
    protected OrchestrationGlobalAllOfOrchestrationPath1 orchestrationPath;

    /**
     * List of applicable warnings messages for each rule using a feature not available on your account plan.
     */
    @JsonProperty("warnings")
    protected List<UpdateOrchPathGlobal200ResponseAllOfWarningsInner> warnings;


}
