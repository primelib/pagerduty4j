package io.github.primelib.pagerduty4j.rest.model;

import java.util.Objects;
import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Extension
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "id",
    "summary",
    "type",
    "self",
    "html_url",
    "name",
    "endpoint_url",
    "extension_objects",
    "extension_schema",
    "temporarily_disabled",
    "config"
})
@JsonTypeName("Extension")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Extension {

    /**
     * Constructs a validated implementation of {@link Extension}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public Extension(Consumer<Extension> spec) {
        spec.accept(this);
    }

    @JsonProperty("id")
    protected String id;

    /**
     * A short-form, server-generated string that provides succinct, important information about an object suitable for primary labeling of an entity in a client. In many cases, this will be identical to `name`, though it is not intended to be an identifier.
     */
    @JsonProperty("summary")
    protected String summary;

    /**
     * The type of object being created.
     */
    @JsonProperty("type")
    protected TypeEnum type = TypeEnum.EXTENSION;

    /**
     * the API show URL at which the object is accessible
     */
    @JsonProperty("self")
    protected String self;

    /**
     * a URL at which the entity is uniquely displayed in the Web app
     */
    @JsonProperty("html_url")
    protected String htmlUrl;

    /**
     * The name of the extension.
     */
    @JsonProperty("name")
    protected String name;

    /**
     * The url of the extension.
     */
    @JsonProperty("endpoint_url")
    protected String endpointUrl;

    /**
     * The objects for which the extension applies
     */
    @JsonProperty("extension_objects")
    protected List<ServiceReference> extensionObjects = new ArrayList<>();

    @JsonProperty("extension_schema")
    protected ExtensionSchemaReference extensionSchema;

    /**
     * Whether or not this extension is temporarily disabled; for example, a webhook extension that is repeatedly rejected by the server.
     */
    @JsonProperty("temporarily_disabled")
    protected Boolean temporarilyDisabled = false;

    /**
     * The object that contains extension configuration values depending on the extension schema specification.
     */
    @JsonProperty("config")
    protected Object config;


    /**
     * The type of object being created.
     */
    @AllArgsConstructor
    public enum TypeEnum {
        EXTENSION("extension");

        private final String value;
    }

}
