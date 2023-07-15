package io.github.primelib.pagerduty4j.rest.model;

import java.util.List;
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
 * ListTeamUsers200ResponseAllOfMembersInner
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "user",
    "role"
})
@JsonTypeName("listTeamUsers_200_response_allOf_members_inner")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ListTeamUsers200ResponseAllOfMembersInner {

    /**
     * Constructs a validated implementation of {@link ListTeamUsers200ResponseAllOfMembersInner}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ListTeamUsers200ResponseAllOfMembersInner(Consumer<ListTeamUsers200ResponseAllOfMembersInner> spec) {
        spec.accept(this);
    }

    @JsonProperty("user")
    protected UserReference user;

    @JsonProperty("role")
    protected String role;


}
