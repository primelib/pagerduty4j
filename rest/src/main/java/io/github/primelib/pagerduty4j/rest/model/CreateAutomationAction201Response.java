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
 * CreateAutomationAction201Response
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
    "action"
})
@JsonTypeName("createAutomationAction_201_response")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateAutomationAction201Response {

    @JsonProperty("action")
    protected CreateAutomationAction201ResponseAction action;

    /**
     * Constructs a validated instance of {@link CreateAutomationAction201Response}.
     *
     * @param spec the specification to process
     */
    public CreateAutomationAction201Response(Consumer<CreateAutomationAction201Response> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link CreateAutomationAction201Response}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #CreateAutomationAction201Response(Consumer)} instead.
     * @param action var.name
     */
    @ApiStatus.Internal
    public CreateAutomationAction201Response(CreateAutomationAction201ResponseAction action) {
        this.action = action;
    }

}
