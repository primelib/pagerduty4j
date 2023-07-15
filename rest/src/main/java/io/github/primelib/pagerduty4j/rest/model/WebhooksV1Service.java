package io.github.primelib.pagerduty4j.rest.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * WebhooksV1Service
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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

    /**
     * Constructs a validated implementation of {@link WebhooksV1Service}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public WebhooksV1Service(Consumer<WebhooksV1Service> spec) {
        spec.accept(this);
    }

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


}
