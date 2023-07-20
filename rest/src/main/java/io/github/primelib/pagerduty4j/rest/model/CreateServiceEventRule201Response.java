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
 * CreateServiceEventRule201Response
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
@JsonTypeName("createServiceEventRule_201_response")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateServiceEventRule201Response {

    @JsonProperty("rule")
    protected ServiceEventRule rule;

    /**
     * Constructs a validated instance of {@link CreateServiceEventRule201Response}.
     *
     * @param spec the specification to process
     */
    public CreateServiceEventRule201Response(Consumer<CreateServiceEventRule201Response> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link CreateServiceEventRule201Response}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #CreateServiceEventRule201Response(Consumer)} instead.
     * @param rule var.name
     */
    @ApiStatus.Internal
    public CreateServiceEventRule201Response(ServiceEventRule rule) {
        this.rule = rule;
    }

}
