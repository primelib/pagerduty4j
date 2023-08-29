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
 * TagsToAdd
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
    "type",
    "label",
    "id"
})
@JsonTypeName("Tags_to_add")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class TagsToAdd {

    @JsonProperty("type")
    protected TypeEnum type;

    /**
     * The label of the tag. Should be used when type is "tag".
     */
    @JsonProperty("label")
    protected String label;

    /**
     * The id of the tag. Should be used when type is "tag_reference".
     */
    @JsonProperty("id")
    protected String id;

    /**
     * Constructs a validated instance of {@link TagsToAdd}.
     *
     * @param spec the specification to process
     */
    public TagsToAdd(Consumer<TagsToAdd> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link TagsToAdd}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #TagsToAdd(Consumer)} instead.
     * @param type type
     * @param label The label of the tag. Should be used when type is "tag".
     * @param id The id of the tag. Should be used when type is "tag_reference".
     */
    @ApiStatus.Internal
    public TagsToAdd(TypeEnum type, String label, String id) {
        this.type = type;
        this.label = label;
        this.id = id;
    }

    @AllArgsConstructor
    public enum TypeEnum {
        TAG("tag"),
        TAG_REFERENCE("tag_reference");

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
