package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Team2
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "id"
})
@JsonTypeName("Team_2")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Team2 {

    /**
     * The team ID
     */
    @JsonProperty("id")
    private String id;


}
