package com.reikratei.spring.batch.io;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.InitializingBean;

public class InfoPassThroughToStdOut implements Tasklet, InitializingBean {

	private static int counter = 0;

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Props Set for " + this.getClass().getName());
	}

	@Override
	public RepeatStatus execute(StepContribution arg0, ChunkContext arg1) throws Exception {
		System.out.println(arg0.toString() + "  " + arg1.toString());
		if (counter == 10) {
			return RepeatStatus.FINISHED;
		}
		counter++;
		return RepeatStatus.CONTINUABLE;
	}

}