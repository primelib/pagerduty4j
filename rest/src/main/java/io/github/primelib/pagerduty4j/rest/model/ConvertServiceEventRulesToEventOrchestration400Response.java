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
 * ConvertServiceEventRulesToEventOrchestration400Response
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
    "error"
})
@JsonTypeName("convertServiceEventRulesToEventOrchestration_400_response")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ConvertServiceEventRulesToEventOrchestration400Response {

    @JsonProperty("error")
    protected ConvertServiceEventRulesToEventOrchestration400ResponseError error;

    /**
     * Constructs a validated instance of {@link ConvertServiceEventRulesToEventOrchestration400Response}.
     *
     * @param spec the specification to process
     */
    public ConvertServiceEventRulesToEventOrchestration400Response(Consumer<ConvertServiceEventRulesToEventOrchestration400Response> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ConvertServiceEventRulesToEventOrchestration400Response}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ConvertServiceEventRulesToEventOrchestration400Response(Consumer)} instead.
     * @param error error
     */
    @ApiStatus.Internal
    public ConvertServiceEventRulesToEventOrchestration400Response(ConvertServiceEventRulesToEventOrchestration400ResponseError error) {
        this.error = error;
    }

}
