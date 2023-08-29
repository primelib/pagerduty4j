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
 * CreateRulesetEventRule201Response
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
    "rule"
})
@JsonTypeName("createRulesetEventRule_201_response")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateRulesetEventRule201Response {

    @JsonProperty("rule")
    protected EventRule rule;

    /**
     * Constructs a validated instance of {@link CreateRulesetEventRule201Response}.
     *
     * @param spec the specification to process
     */
    public CreateRulesetEventRule201Response(Consumer<CreateRulesetEventRule201Response> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link CreateRulesetEventRule201Response}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #CreateRulesetEventRule201Response(Consumer)} instead.
     * @param rule rule
     */
    @ApiStatus.Internal
    public CreateRulesetEventRule201Response(EventRule rule) {
        this.rule = rule;
    }

}
