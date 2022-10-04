package org.example.camunda.process.solution;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import org.apache.commons.lang3.builder.MultilineRecursiveToStringStyle;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@JsonInclude(Include.NON_NULL)
public class ProcessVariables {

  private String businessKey;
  private String name;
  private Integer hour;
  private String timeOfDay;
  private String result;

  public String getBusinessKey() {
    return businessKey;
  }

  public ProcessVariables setBusinessKey(String businessKey) {
    this.businessKey = businessKey;
    return this;
  }

  public ProcessVariables setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public ProcessVariables setHour(Integer hour) {
    this.hour = hour;
    return this;
  }

  public Integer getHour() {
    return hour;
  }

  public ProcessVariables setTimeOfDay(String timeOfDay) {
    this.timeOfDay = timeOfDay;
    return this;
  }

  public String getTimeOfDay() {
    return timeOfDay;
  }

  public String getResult() {
    return result;
  }

  public ProcessVariables setResult(String result) {
    this.result = result;
    return this;
  }

  @Override
  public String toString() {
    return ToStringBuilder.reflectionToString(
        this,
        new MultilineRecursiveToStringStyle() {
          public ToStringStyle withShortPrefixes() {
            this.setUseShortClassName(true);
            this.setUseIdentityHashCode(false);
            return this;
          }
        }.withShortPrefixes());
  }
}
