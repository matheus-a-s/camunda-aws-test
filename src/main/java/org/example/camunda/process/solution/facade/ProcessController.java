package org.example.camunda.process.solution.facade;

import io.camunda.zeebe.client.ZeebeClient;
import org.example.camunda.process.solution.ProcessConstants;
import org.example.camunda.process.solution.ProcessCont;
import org.example.camunda.process.solution.ProcessVariables;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/process")
public class ProcessController {

  private static final Logger LOG = LoggerFactory.getLogger(ProcessController.class);

  @Autowired private ZeebeClient zeebe;

  private ProcessCont cont = new ProcessCont(0);

  @PostMapping("/start")
  public void startProcessInstance(@RequestBody ProcessVariables variables)
      throws InterruptedException {

    Integer test = 0;
    // while (test == 0) {
    // try {
    zeebe
        .newCreateInstanceCommand()
        .bpmnProcessId(ProcessConstants.BPMN_PROCESS_ID)
        .latestVersion()
        .variables(variables)
        .send()
        .join();
    // .notify();

    // cont.setCont(1);
    // test = 1;
    // LOG.info(
    // "Starting process `"
    // + ProcessConstants.BPMN_PROCESS_ID
    // + "` with variables: "
    // + variables
    // + "` contador: "
    // + cont.getCont());

    // } catch (Exception e) {
    // System.out.print("\n" + e + "\n");
    // test = 0;
    // }
    // }
    // System.out.print("\n");
    // System.out.print(
    // zeebe
    // .newCreateInstanceCommand()
    // .bpmnProcessId(ProcessConstants.BPMN_PROCESS_ID)
    // .latestVersion()
    // .variables(variables)
    // .send()
    // .join());

    // if (zeebe
    // .newCreateInstanceCommand()
    // .bpmnProcessId(ProcessConstants.BPMN_PROCESS_ID)
    // .latestVersion()
    // .variables(variables)
    // .send()
    // .isDone()) {
    // cont.setCont(1);
    // }

    // System.out.print("\n");
    // System.out.print(cont.getCont());

    // System.out.print("\n");
  }
}
