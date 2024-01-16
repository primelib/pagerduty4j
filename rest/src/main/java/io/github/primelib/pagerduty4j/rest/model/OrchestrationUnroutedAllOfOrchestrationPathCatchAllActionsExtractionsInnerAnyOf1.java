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
 * OrchestrationUnroutedAllOfOrchestrationPathCatchAllActionsExtractionsInnerAnyOf1
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
    "target",
    "regex",
    "source"
})
@JsonTypeName("OrchestrationUnrouted_allOf_orchestration_path_catch_all_actions_extractions_inner_anyOf_1")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class OrchestrationUnroutedAllOfOrchestrationPathCatchAllActionsExtractionsInnerAnyOf1 {

    /**
     * The PD-CEF field that will be set with the value from the regex.
     */
    @JsonProperty("target")
    protected String target;

    /**
     * A RE2 regular expression. If it contains one or more capture groups, their values will be extracted and appended together. If it contains no capture groups, the whole match is used.
     */
    @JsonProperty("regex")
    protected String regex;

    /**
     * The path to the event field where the regex will be applied to extract a value.
     */
    @JsonProperty("source")
    protected String source;

    /**
     * Constructs a validated instance of {@link OrchestrationUnroutedAllOfOrchestrationPathCatchAllActionsExtractionsInnerAnyOf1}.
     *
     * @param spec the specification to process
     */
    public OrchestrationUnroutedAllOfOrchestrationPathCatchAllActionsExtractionsInnerAnyOf1(Consumer<OrchestrationUnroutedAllOfOrchestrationPathCatchAllActionsExtractionsInnerAnyOf1> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link OrchestrationUnroutedAllOfOrchestrationPathCatchAllActionsExtractionsInnerAnyOf1}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #OrchestrationUnroutedAllOfOrchestrationPathCatchAllActionsExtractionsInnerAnyOf1(Consumer)} instead.
     * @param target The PD-CEF field that will be set with the value from the regex.
     * @param regex A RE2 regular expression. If it contains one or more capture groups, their values will be extracted and appended together. If it contains no capture groups, the whole match is used.
     * @param source The path to the event field where the regex will be applied to extract a value.
     */
    @ApiStatus.Internal
    public OrchestrationUnroutedAllOfOrchestrationPathCatchAllActionsExtractionsInnerAnyOf1(String target, String regex, String source) {
        this.target = target;
        this.regex = regex;
        this.source = source;
    }

}
