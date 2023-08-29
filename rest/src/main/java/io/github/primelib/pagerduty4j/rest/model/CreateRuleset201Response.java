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
 * CreateRuleset201Response
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
    "ruleset"
})
@JsonTypeName("createRuleset_201_response")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateRuleset201Response {

    @JsonProperty("ruleset")
    protected Ruleset ruleset;

    /**
     * Constructs a validated instance of {@link CreateRuleset201Response}.
     *
     * @param spec the specification to process
     */
    public CreateRuleset201Response(Consumer<CreateRuleset201Response> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link CreateRuleset201Response}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #CreateRuleset201Response(Consumer)} instead.
     * @param ruleset ruleset
     */
    @ApiStatus.Internal
    public CreateRuleset201Response(Ruleset ruleset) {
        this.ruleset = ruleset;
    }

}
