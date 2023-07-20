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
 * CreateTeamRequest
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
    "team"
})
@JsonTypeName("createTeam_request")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateTeamRequest {

    @JsonProperty("team")
    protected Team team;

    /**
     * Constructs a validated instance of {@link CreateTeamRequest}.
     *
     * @param spec the specification to process
     */
    public CreateTeamRequest(Consumer<CreateTeamRequest> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link CreateTeamRequest}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #CreateTeamRequest(Consumer)} instead.
     * @param team var.name
     */
    @ApiStatus.Internal
    public CreateTeamRequest(Team team) {
        this.team = team;
    }

}
