package org.example.camunda.process.solution;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class ProcessCont {

  private Integer cont;

  public ProcessCont(Integer cont) {
    this.cont = cont;
  }

  public Integer getCont() {
    return cont;
  }

  public ProcessCont setCont(Integer cont) {
    this.cont += cont;
    return this;
  }
}
