package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.AllArgsConstructor;

import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * AutomationActionsActionClassificationEnum
 * 
 *
 */
@JsonTypeName("AutomationActionsActionClassificationEnum")
@AllArgsConstructor
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public enum AutomationActionsActionClassificationEnum {
    DIAGNOSTIC("diagnostic"),
    REMEDIATION("remediation");

    private final String value;
}
