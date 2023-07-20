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

import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * WebhooksV1Service
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
    "html_url",
    "deleted_at",
    "description"
})
@JsonTypeName("WebhooksV1Service")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class WebhooksV1Service {

    @JsonProperty("id")
    protected String id;

    /**
     * The name of the service.
     */
    @JsonProperty("name")
    protected String name;

    @JsonProperty("html_url")
    protected String htmlUrl;

    /**
     * The date/time the service was deleted, if it has been removed.
     */
    @JsonProperty("deleted_at")
    protected OffsetDateTime deletedAt;

    /**
     * The description of the service.
     */
    @JsonProperty("description")
    protected String description;

    /**
     * Constructs a validated instance of {@link WebhooksV1Service}.
     *
     * @param spec the specification to process
     */
    public WebhooksV1Service(Consumer<WebhooksV1Service> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link WebhooksV1Service}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #WebhooksV1Service(Consumer)} instead.
     * @param id var.name
     * @param name The name of the service.
     * @param htmlUrl var.name
     * @param deletedAt The date/time the service was deleted, if it has been removed.
     * @param description The description of the service.
     */
    @ApiStatus.Internal
    public WebhooksV1Service(String id, String name, String htmlUrl, OffsetDateTime deletedAt, String description) {
        this.id = id;
        this.name = name;
        this.htmlUrl = htmlUrl;
        this.deletedAt = deletedAt;
        this.description = description;
    }

}
