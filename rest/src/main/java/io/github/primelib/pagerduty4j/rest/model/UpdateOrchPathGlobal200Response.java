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
 * UpdateOrchPathGlobal200Response
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
    "orchestration_path",
    "warnings"
})
@JsonTypeName("updateOrchPathGlobal_200_response")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UpdateOrchPathGlobal200Response {

    @JsonProperty("orchestration_path")
    protected OrchestrationGlobalAllOfOrchestrationPath1 orchestrationPath;

    /**
     * List of applicable warnings messages for each rule using a feature not available on your account plan.
     */
    @JsonProperty("warnings")
    protected List<UpdateOrchPathGlobal200ResponseAllOfWarningsInner> warnings;

    /**
     * Constructs a validated instance of {@link UpdateOrchPathGlobal200Response}.
     *
     * @param spec the specification to process
     */
    public UpdateOrchPathGlobal200Response(Consumer<UpdateOrchPathGlobal200Response> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link UpdateOrchPathGlobal200Response}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #UpdateOrchPathGlobal200Response(Consumer)} instead.
     * @param orchestrationPath orchestrationPath
     * @param warnings List of applicable warnings messages for each rule using a feature not available on your account plan.
     */
    @ApiStatus.Internal
    public UpdateOrchPathGlobal200Response(OrchestrationGlobalAllOfOrchestrationPath1 orchestrationPath, List<UpdateOrchPathGlobal200ResponseAllOfWarningsInner> warnings) {
        this.orchestrationPath = orchestrationPath;
        this.warnings = warnings;
    }

}
