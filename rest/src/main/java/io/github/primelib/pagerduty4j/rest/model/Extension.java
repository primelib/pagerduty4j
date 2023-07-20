package io.github.primelib.pagerduty4j.rest.model;

import java.util.Objects;
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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Extension
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

    @JsonProperty("id")
    protected String id;

    /**
     * A short-form, server-generated string that provides succinct, important information about an object suitable for primary labeling of an entity in a client. In many cases, this will be identical to {@code name}, though it is not intended to be an identifier.
     */
    @JsonProperty("summary")
    protected String summary;

    /**
     * The type of object being created.
     */
    @JsonProperty("type")
    protected TypeEnum type;

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
    protected List<ServiceReference> extensionObjects;

    @JsonProperty("extension_schema")
    protected ExtensionSchemaReference extensionSchema;

    /**
     * Whether or not this extension is temporarily disabled; for example, a webhook extension that is repeatedly rejected by the server.
     */
    @JsonProperty("temporarily_disabled")
    protected Boolean temporarilyDisabled;

    /**
     * The object that contains extension configuration values depending on the extension schema specification.
     */
    @JsonProperty("config")
    protected Object config;

    /**
     * Constructs a validated instance of {@link Extension}.
     *
     * @param spec the specification to process
     */
    public Extension(Consumer<Extension> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link Extension}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #Extension(Consumer)} instead.
     * @param id var.name
     * @param summary A short-form, server-generated string that provides succinct, important information about an object suitable for primary labeling of an entity in a client. In many cases, this will be identical to {@code name}, though it is not intended to be an identifier.
     * @param type The type of object being created.
     * @param self the API show URL at which the object is accessible
     * @param htmlUrl a URL at which the entity is uniquely displayed in the Web app
     * @param name The name of the extension.
     * @param endpointUrl The url of the extension.
     * @param extensionObjects The objects for which the extension applies
     * @param extensionSchema var.name
     * @param temporarilyDisabled Whether or not this extension is temporarily disabled; for example, a webhook extension that is repeatedly rejected by the server.
     * @param config The object that contains extension configuration values depending on the extension schema specification.
     */
    @ApiStatus.Internal
    public Extension(String id, String summary, TypeEnum type, String self, String htmlUrl, String name, String endpointUrl, List<ServiceReference> extensionObjects, ExtensionSchemaReference extensionSchema, Boolean temporarilyDisabled, Object config) {
        this.id = id;
        this.summary = summary;
        this.type = type;
        this.self = self;
        this.htmlUrl = htmlUrl;
        this.name = name;
        this.endpointUrl = endpointUrl;
        this.extensionObjects = extensionObjects;
        this.extensionSchema = extensionSchema;
        this.temporarilyDisabled = temporarilyDisabled;
        this.config = config;
    }

    /**
     * The type of object being created.
     */
    @AllArgsConstructor
    public enum TypeEnum {
        EXTENSION("extension");

        private final String value;
    }

}
