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
 * CreateAutomationActionTeamAssociationRequest
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
@JsonTypeName("createAutomationActionTeamAssociation_request")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateAutomationActionTeamAssociationRequest {

    @JsonProperty("team")
    protected TeamReference team;

    /**
     * Constructs a validated instance of {@link CreateAutomationActionTeamAssociationRequest}.
     *
     * @param spec the specification to process
     */
    public CreateAutomationActionTeamAssociationRequest(Consumer<CreateAutomationActionTeamAssociationRequest> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link CreateAutomationActionTeamAssociationRequest}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #CreateAutomationActionTeamAssociationRequest(Consumer)} instead.
     * @param team team
     */
    @ApiStatus.Internal
    public CreateAutomationActionTeamAssociationRequest(TeamReference team) {
        this.team = team;
    }

}
