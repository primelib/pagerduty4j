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
 * CreateAutomationActionRequest
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
@JsonTypeName("createAutomationAction_request")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateAutomationActionRequest {

    @JsonProperty("action")
    protected CreateAutomationActionRequestAction action;

    /**
     * Constructs a validated instance of {@link CreateAutomationActionRequest}.
     *
     * @param spec the specification to process
     */
    public CreateAutomationActionRequest(Consumer<CreateAutomationActionRequest> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link CreateAutomationActionRequest}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #CreateAutomationActionRequest(Consumer)} instead.
     * @param action action
     */
    @ApiStatus.Internal
    public CreateAutomationActionRequest(CreateAutomationActionRequestAction action) {
        this.action = action;
    }

}
