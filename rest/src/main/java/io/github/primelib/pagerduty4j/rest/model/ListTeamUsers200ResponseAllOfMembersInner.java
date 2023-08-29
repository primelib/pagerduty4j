package io.github.primelib.pagerduty4j.rest.model;

import java.util.List;
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
 * ListTeamUsers200ResponseAllOfMembersInner
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
    "user",
    "role"
})
@JsonTypeName("listTeamUsers_200_response_allOf_members_inner")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ListTeamUsers200ResponseAllOfMembersInner {

    @JsonProperty("user")
    protected UserReference user;

    @JsonProperty("role")
    protected String role;

    /**
     * Constructs a validated instance of {@link ListTeamUsers200ResponseAllOfMembersInner}.
     *
     * @param spec the specification to process
     */
    public ListTeamUsers200ResponseAllOfMembersInner(Consumer<ListTeamUsers200ResponseAllOfMembersInner> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ListTeamUsers200ResponseAllOfMembersInner}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ListTeamUsers200ResponseAllOfMembersInner(Consumer)} instead.
     * @param user user
     * @param role role
     */
    @ApiStatus.Internal
    public ListTeamUsers200ResponseAllOfMembersInner(UserReference user, String role) {
        this.user = user;
        this.role = role;
    }

}
