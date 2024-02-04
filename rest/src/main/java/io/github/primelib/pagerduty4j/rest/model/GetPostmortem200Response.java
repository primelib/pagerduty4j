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
 * GetPostmortem200Response
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
    "postmortem"
})
@JsonTypeName("getPostmortem_200_response")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetPostmortem200Response {

    @JsonProperty("postmortem")
    protected StatusPagePostmortem postmortem;

    /**
     * Constructs a validated instance of {@link GetPostmortem200Response}.
     *
     * @param spec the specification to process
     */
    public GetPostmortem200Response(Consumer<GetPostmortem200Response> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link GetPostmortem200Response}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #GetPostmortem200Response(Consumer)} instead.
     * @param postmortem postmortem
     */
    @ApiStatus.Internal
    public GetPostmortem200Response(StatusPagePostmortem postmortem) {
        this.postmortem = postmortem;
    }

}
