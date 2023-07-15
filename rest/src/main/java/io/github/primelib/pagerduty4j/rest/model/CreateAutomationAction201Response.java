package io.github.primelib.pagerduty4j.rest.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateAutomationAction201Response
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "action"
})
@JsonTypeName("createAutomationAction_201_response")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateAutomationAction201Response {

    /**
     * Constructs a validated implementation of {@link CreateAutomationAction201Response}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public CreateAutomationAction201Response(Consumer<CreateAutomationAction201Response> spec) {
        spec.accept(this);
    }

    @JsonProperty("action")
    protected CreateAutomationAction201ResponseAction action;


}
