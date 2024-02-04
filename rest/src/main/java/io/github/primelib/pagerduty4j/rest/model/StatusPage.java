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

import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * StatusPage
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
    "published_at",
    "status_page_type",
    "url",
    "type"
})
@JsonTypeName("StatusPage")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class StatusPage {

    /**
     * An unique identifier within Status Page scope that defines a Status Page entry.
     */
    @JsonProperty("id")
    protected String id;

    /**
     * The name of a Status Page to be presented as a brand title (for example, the rendered Status Page HTML header).
     */
    @JsonProperty("name")
    protected String name;

    /**
     * The date time moment when a Status Page was published to be publicly available.
     */
    @JsonProperty("published_at")
    protected OffsetDateTime publishedAt;

    /**
     * The type of Status Pages to retrieve - public is accessible to everyone on the internet or private requiring some sort of authentication/authorization layer.
     */
    @JsonProperty("status_page_type")
    protected StatusPageTypeEnum statusPageType;

    /**
     * The URL from which the Status Page can be accessed on the internet (either customer's domain or default *.trust.pagerduty.com).
     */
    @JsonProperty("url")
    protected String url;

    /**
     * A string that determines the schema of the object. This must be the standard name for the entity, suffixed by _reference if the object is a reference.
     */
    @JsonProperty("type")
    protected String type;

    /**
     * Constructs a validated instance of {@link StatusPage}.
     *
     * @param spec the specification to process
     */
    public StatusPage(Consumer<StatusPage> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link StatusPage}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #StatusPage(Consumer)} instead.
     * @param id An unique identifier within Status Page scope that defines a Status Page entry.
     * @param name The name of a Status Page to be presented as a brand title (for example, the rendered Status Page HTML header).
     * @param publishedAt The date time moment when a Status Page was published to be publicly available.
     * @param statusPageType The type of Status Pages to retrieve - public is accessible to everyone on the internet or private requiring some sort of authentication/authorization layer.
     * @param url The URL from which the Status Page can be accessed on the internet (either customer's domain or default *.trust.pagerduty.com).
     * @param type A string that determines the schema of the object. This must be the standard name for the entity, suffixed by _reference if the object is a reference.
     */
    @ApiStatus.Internal
    public StatusPage(String id, String name, OffsetDateTime publishedAt, StatusPageTypeEnum statusPageType, String url, String type) {
        this.id = id;
        this.name = name;
        this.publishedAt = publishedAt;
        this.statusPageType = statusPageType;
        this.url = url;
        this.type = type;
    }

    /**
     * The type of Status Pages to retrieve - public is accessible to everyone on the internet or private requiring some sort of authentication/authorization layer.
     */
    @AllArgsConstructor
    public enum StatusPageTypeEnum {
        PUBLIC("public"),
        PRIVATE("private");

        private static final StatusPageTypeEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static StatusPageTypeEnum of(String input) {
            if (input != null) {
                for (StatusPageTypeEnum v : VALUES) {
                    if (input.equalsIgnoreCase(v.value)) 
                        return v;
                }
            }

            return null;
        }

        @JsonValue
        public String getValue() {
            return value;
        }
    }

}
