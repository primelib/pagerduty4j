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
 * GetExtension200Response
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
    "extension"
})
@JsonTypeName("getExtension_200_response")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetExtension200Response {

    @JsonProperty("extension")
    protected Extension extension;

    /**
     * Constructs a validated instance of {@link GetExtension200Response}.
     *
     * @param spec the specification to process
     */
    public GetExtension200Response(Consumer<GetExtension200Response> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link GetExtension200Response}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #GetExtension200Response(Consumer)} instead.
     * @param extension extension
     */
    @ApiStatus.Internal
    public GetExtension200Response(Extension extension) {
        this.extension = extension;
    }

}
