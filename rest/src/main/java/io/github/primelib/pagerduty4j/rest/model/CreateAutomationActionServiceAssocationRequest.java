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
 * CreateAutomationActionServiceAssocationRequest
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
    "service"
})
@JsonTypeName("createAutomationActionServiceAssocation_request")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateAutomationActionServiceAssocationRequest {

    @JsonProperty("service")
    protected ServiceReference service;

    /**
     * Constructs a validated instance of {@link CreateAutomationActionServiceAssocationRequest}.
     *
     * @param spec the specification to process
     */
    public CreateAutomationActionServiceAssocationRequest(Consumer<CreateAutomationActionServiceAssocationRequest> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link CreateAutomationActionServiceAssocationRequest}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #CreateAutomationActionServiceAssocationRequest(Consumer)} instead.
     * @param service service
     */
    @ApiStatus.Internal
    public CreateAutomationActionServiceAssocationRequest(ServiceReference service) {
        this.service = service;
    }

}
