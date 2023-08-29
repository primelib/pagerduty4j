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
 * WebhooksV1AssignedToUser
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
    "id",
    "name",
    "email",
    "html_url"
})
@JsonTypeName("WebhooksV1AssignedToUser")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class WebhooksV1AssignedToUser {

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

    /**
     * Constructs a validated instance of {@link WebhooksV1AssignedToUser}.
     *
     * @param spec the specification to process
     */
    public WebhooksV1AssignedToUser(Consumer<WebhooksV1AssignedToUser> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link WebhooksV1AssignedToUser}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #WebhooksV1AssignedToUser(Consumer)} instead.
     * @param id id
     * @param name The user's name.
     * @param email The user's email address.
     * @param htmlUrl htmlUrl
     */
    @ApiStatus.Internal
    public WebhooksV1AssignedToUser(String id, String name, String email, String htmlUrl) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.htmlUrl = htmlUrl;
    }

}
