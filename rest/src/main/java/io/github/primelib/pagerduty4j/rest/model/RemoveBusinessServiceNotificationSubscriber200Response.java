package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * RemoveBusinessServiceNotificationSubscriber200Response
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "deleted_count",
    "unauthorized_count",
    "non_existent_count"
})
@JsonTypeName("removeBusinessServiceNotificationSubscriber_200_response")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class RemoveBusinessServiceNotificationSubscriber200Response {

    @JsonProperty("deleted_count")
    private BigDecimal deletedCount;

    @JsonProperty("unauthorized_count")
    private BigDecimal unauthorizedCount;

    @JsonProperty("non_existent_count")
    private BigDecimal nonExistentCount;


}
