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
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * ResponsePlayAllOfTeam
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
    "html_url"
})
@JsonTypeName("ResponsePlay_allOf_team")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ResponsePlayAllOfTeam {

    @JsonProperty("id")
    protected String id;

    /**
     * A short-form, server-generated string that provides succinct, important information about an object suitable for primary labeling of an entity in a client. In many cases, this will be identical to {@code name}, though it is not intended to be an identifier.
     */
    @JsonProperty("summary")
    protected String summary;

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
     * Constructs a validated instance of {@link ResponsePlayAllOfTeam}.
     *
     * @param spec the specification to process
     */
    public ResponsePlayAllOfTeam(Consumer<ResponsePlayAllOfTeam> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ResponsePlayAllOfTeam}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ResponsePlayAllOfTeam(Consumer)} instead.
     * @param id id
     * @param summary A short-form, server-generated string that provides succinct, important information about an object suitable for primary labeling of an entity in a client. In many cases, this will be identical to {@code name}, though it is not intended to be an identifier.
     * @param type type
     * @param self the API show URL at which the object is accessible
     * @param htmlUrl a URL at which the entity is uniquely displayed in the Web app
     */
    @ApiStatus.Internal
    public ResponsePlayAllOfTeam(String id, String summary, TypeEnum type, String self, String htmlUrl) {
        this.id = id;
        this.summary = summary;
        this.type = type;
        this.self = self;
        this.htmlUrl = htmlUrl;
    }

    @AllArgsConstructor
    public enum TypeEnum {
        TEAM_REFERENCE("team_reference");

        private static final TypeEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static TypeEnum of(String input) {
            if (input != null) {
                for (TypeEnum v : VALUES) {
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
