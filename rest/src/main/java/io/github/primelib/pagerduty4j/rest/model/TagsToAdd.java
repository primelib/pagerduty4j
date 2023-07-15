package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * TagsToAdd
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "type",
    "label",
    "id"
})
@JsonTypeName("Tags_to_add")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class TagsToAdd {

    @JsonProperty("type")
    private TypeEnum type;

    /**
     * The label of the tag. Should be used when type is "tag".
     */
    @JsonProperty("label")
    private String label;

    /**
     * The id of the tag. Should be used when type is "tag_reference".
     */
    @JsonProperty("id")
    private String id;


    @AllArgsConstructor
    public enum TypeEnum {
        TAG("tag"),
        TAG_REFERENCE("tag_reference");

        private final String value;
    }

}
