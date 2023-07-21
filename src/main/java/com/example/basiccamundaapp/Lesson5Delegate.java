package com.example.basiccamundaapp;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

    @Component("DelegateFromLesson5")
    public class Lesson5Delegate implements JavaDelegate {
        @Override
        public void execute(DelegateExecution delEx) throws Exception {
            final String procVar1 = (String) delEx.getVariable("parameter1");
            System.out.println(String.format("Lesson5Delegate.execute, procVar1='%s'", procVar1));
        }
    }


