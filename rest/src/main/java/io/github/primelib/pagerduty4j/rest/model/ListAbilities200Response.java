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
 * ListAbilities200Response
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
    "abilities"
})
@JsonTypeName("listAbilities_200_response")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ListAbilities200Response {

    /**
     * The set of abilities your account has.
     */
    @JsonProperty("abilities")
    protected List<String> abilities;

    /**
     * Constructs a validated instance of {@link ListAbilities200Response}.
     *
     * @param spec the specification to process
     */
    public ListAbilities200Response(Consumer<ListAbilities200Response> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ListAbilities200Response}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ListAbilities200Response(Consumer)} instead.
     * @param abilities The set of abilities your account has.
     */
    @ApiStatus.Internal
    public ListAbilities200Response(List<String> abilities) {
        this.abilities = abilities;
    }

}
