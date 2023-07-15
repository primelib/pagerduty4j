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
 * GetChangeEvent200Response
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "change_event"
})
@JsonTypeName("getChangeEvent_200_response")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetChangeEvent200Response {

    /**
     * Constructs a validated implementation of {@link GetChangeEvent200Response}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetChangeEvent200Response(Consumer<GetChangeEvent200Response> spec) {
        spec.accept(this);
    }

    @JsonProperty("change_event")
    protected ChangeEvent changeEvent;


}
