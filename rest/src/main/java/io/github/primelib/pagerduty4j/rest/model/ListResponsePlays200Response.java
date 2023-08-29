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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ListResponsePlays200Response
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
    "response_plays"
})
@JsonTypeName("listResponsePlays_200_response")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ListResponsePlays200Response {

    @JsonProperty("response_plays")
    protected List<ResponsePlay> responsePlays;

    /**
     * Constructs a validated instance of {@link ListResponsePlays200Response}.
     *
     * @param spec the specification to process
     */
    public ListResponsePlays200Response(Consumer<ListResponsePlays200Response> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ListResponsePlays200Response}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ListResponsePlays200Response(Consumer)} instead.
     * @param responsePlays responsePlays
     */
    @ApiStatus.Internal
    public ListResponsePlays200Response(List<ResponsePlay> responsePlays) {
        this.responsePlays = responsePlays;
    }

}
