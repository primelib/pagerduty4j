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
 * RunResponsePlay200Response
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
    "status"
})
@JsonTypeName("runResponsePlay_200_response")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class RunResponsePlay200Response {

    @JsonProperty("status")
    protected String status;

    /**
     * Constructs a validated instance of {@link RunResponsePlay200Response}.
     *
     * @param spec the specification to process
     */
    public RunResponsePlay200Response(Consumer<RunResponsePlay200Response> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link RunResponsePlay200Response}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #RunResponsePlay200Response(Consumer)} instead.
     * @param status var.name
     */
    @ApiStatus.Internal
    public RunResponsePlay200Response(String status) {
        this.status = status;
    }

}
