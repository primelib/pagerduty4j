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
import lombok.AllArgsConstructor;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * WebhooksV1AssignedToObject
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
    "html_url",
    "type"
})
@JsonTypeName("WebhooksV1AssignedTo_object")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class WebhooksV1AssignedToObject {

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

    @JsonProperty("type")
    protected TypeEnum type;

    /**
     * Constructs a validated instance of {@link WebhooksV1AssignedToObject}.
     *
     * @param spec the specification to process
     */
    public WebhooksV1AssignedToObject(Consumer<WebhooksV1AssignedToObject> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link WebhooksV1AssignedToObject}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #WebhooksV1AssignedToObject(Consumer)} instead.
     * @param id var.name
     * @param name The user's name.
     * @param email The user's email address.
     * @param htmlUrl var.name
     * @param type var.name
     */
    @ApiStatus.Internal
    public WebhooksV1AssignedToObject(String id, String name, String email, String htmlUrl, TypeEnum type) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.htmlUrl = htmlUrl;
        this.type = type;
    }

    @AllArgsConstructor
    public enum TypeEnum {
        USER("user");

        private final String value;
    }

}
