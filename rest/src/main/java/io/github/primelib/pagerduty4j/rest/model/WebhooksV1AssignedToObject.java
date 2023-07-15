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
 * WebhooksV1AssignedToObject
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
    "html_url",
    "type"
})
@JsonTypeName("WebhooksV1AssignedTo_object")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class WebhooksV1AssignedToObject {

    /**
     * Constructs a validated implementation of {@link WebhooksV1AssignedToObject}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public WebhooksV1AssignedToObject(Consumer<WebhooksV1AssignedToObject> spec) {
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

    @JsonProperty("type")
    protected TypeEnum type;


    @AllArgsConstructor
    public enum TypeEnum {
        USER("user");

        private final String value;
    }

}
