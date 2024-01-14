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
 * Field
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
    "data_type",
    "default_value",
    "description",
    "domain_name",
    "example",
    "keyword",
    "summary",
    "type"
})
@JsonTypeName("Field")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Field {

    /**
     * The kind of data the template field is allowed to contain.
     */
    @JsonProperty("data_type")
    protected DataTypeEnum dataType;

    /**
     * The default value of the template field.
     */
    @JsonProperty("default_value")
    protected String defaultValue;

    /**
     * A short description of the template field.
     */
    @JsonProperty("description")
    protected String description;

    @JsonProperty("domain_name")
    protected FieldDomainName domainName;

    /**
     * An example value for the template field.
     */
    @JsonProperty("example")
    protected String example;

    @JsonProperty("keyword")
    protected String keyword;

    /**
     * A short summary of the template field.
     */
    @JsonProperty("summary")
    protected String summary;

    /**
     * The type of template field.
     */
    @JsonProperty("type")
    protected TypeEnum type;

    /**
     * Constructs a validated instance of {@link Field}.
     *
     * @param spec the specification to process
     */
    public Field(Consumer<Field> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link Field}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #Field(Consumer)} instead.
     * @param dataType The kind of data the template field is allowed to contain.
     * @param defaultValue The default value of the template field.
     * @param description A short description of the template field.
     * @param domainName domainName
     * @param example An example value for the template field.
     * @param keyword keyword
     * @param summary A short summary of the template field.
     * @param type The type of template field.
     */
    @ApiStatus.Internal
    public Field(DataTypeEnum dataType, String defaultValue, String description, FieldDomainName domainName, String example, String keyword, String summary, TypeEnum type) {
        this.dataType = dataType;
        this.defaultValue = defaultValue;
        this.description = description;
        this.domainName = domainName;
        this.example = example;
        this.keyword = keyword;
        this.summary = summary;
        this.type = type;
    }

    /**
     * The kind of data the template field is allowed to contain.
     */
    @AllArgsConstructor
    public enum DataTypeEnum {
        BOOLEAN("boolean"),
        INTEGER("integer"),
        FLOAT("float"),
        STRING("string"),
        DATETIME("datetime"),
        URL("url");

        private static final DataTypeEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static DataTypeEnum of(String input) {
            if (input != null) {
                for (DataTypeEnum v : VALUES) {
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

    /**
     * The type of template field.
     */
    @AllArgsConstructor
    public enum TypeEnum {
        STANDARD_FIELD("standard_field"),
        CUSTOM_FIELD("custom_field");

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
