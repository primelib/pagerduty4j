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
 * CreateAutomationActionInvocation201Response
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
    "invocation"
})
@JsonTypeName("createAutomationActionInvocation_201_response")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateAutomationActionInvocation201Response {

    @JsonProperty("invocation")
    protected CreateAutomationActionInvocation201ResponseInvocation invocation;

    /**
     * Constructs a validated instance of {@link CreateAutomationActionInvocation201Response}.
     *
     * @param spec the specification to process
     */
    public CreateAutomationActionInvocation201Response(Consumer<CreateAutomationActionInvocation201Response> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link CreateAutomationActionInvocation201Response}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #CreateAutomationActionInvocation201Response(Consumer)} instead.
     * @param invocation var.name
     */
    @ApiStatus.Internal
    public CreateAutomationActionInvocation201Response(CreateAutomationActionInvocation201ResponseInvocation invocation) {
        this.invocation = invocation;
    }

}
