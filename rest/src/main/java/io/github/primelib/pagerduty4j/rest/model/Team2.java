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
 * Team2
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
    "id"
})
@JsonTypeName("Team_2")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Team2 {

    /**
     * The team ID
     */
    @JsonProperty("id")
    protected String id;

    /**
     * Constructs a validated instance of {@link Team2}.
     *
     * @param spec the specification to process
     */
    public Team2(Consumer<Team2> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link Team2}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #Team2(Consumer)} instead.
     * @param id The team ID
     */
    @ApiStatus.Internal
    public Team2(String id) {
        this.id = id;
    }

}
