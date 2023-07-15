package io.github.primelib.pagerduty4j.rest.model;

import java.util.Objects;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

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
@NoArgsConstructor
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
    private String id;

    /**
     * A short-form, server-generated string that provides succinct, important information about an object suitable for primary labeling of an entity in a client. In many cases, this will be identical to `name`, though it is not intended to be an identifier.
     */
    @JsonProperty("summary")
    private String summary;

    /**
     * The type of object being created.
     */
    @JsonProperty("type")
    private TypeEnum type = TypeEnum.EXTENSION;

    /**
     * the API show URL at which the object is accessible
     */
    @JsonProperty("self")
    private String self;

    /**
     * a URL at which the entity is uniquely displayed in the Web app
     */
    @JsonProperty("html_url")
    private String htmlUrl;

    /**
     * The name of the extension.
     */
    @JsonProperty("name")
    private String name;

    /**
     * The url of the extension.
     */
    @JsonProperty("endpoint_url")
    private String endpointUrl;

    /**
     * The objects for which the extension applies
     */
    @JsonProperty("extension_objects")
    private List<ServiceReference> extensionObjects = new ArrayList<>();

    @JsonProperty("extension_schema")
    private ExtensionSchemaReference extensionSchema;

    /**
     * Whether or not this extension is temporarily disabled; for example, a webhook extension that is repeatedly rejected by the server.
     */
    @JsonProperty("temporarily_disabled")
    private Boolean temporarilyDisabled = false;

    /**
     * The object that contains extension configuration values depending on the extension schema specification.
     */
    @JsonProperty("config")
    private Object config;


    /**
     * The type of object being created.
     */
    @AllArgsConstructor
    public enum TypeEnum {
        EXTENSION("extension");

        private final String value;
    }

}
