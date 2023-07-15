package io.github.primelib.pagerduty4j.rest.model;

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
 * WebhooksV1AssignedToUser
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "id",
    "name",
    "email",
    "html_url"
})
@JsonTypeName("WebhooksV1AssignedToUser")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class WebhooksV1AssignedToUser {

    /**
     * Constructs a validated implementation of {@link WebhooksV1AssignedToUser}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public WebhooksV1AssignedToUser(Consumer<WebhooksV1AssignedToUser> spec) {
        spec.accept(this);
    }

    @JsonProperty("id")
    protected String id;

    /**
     * The user's name.
     */
    @JsonProperty("name")
    protected String name;

    /**
     * The user's email address.
     */
    @JsonProperty("email")
    protected String email;

    @JsonProperty("html_url")
    protected String htmlUrl;


}
