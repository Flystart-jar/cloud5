package dry.test;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import java.util.Date;

public class HelloJob implements Job {



    public void execute(JobExecutionContext context) throws JobExecutionException {

        // 执行响应的任务.

        System.out.println("HelloJob.execute,"+new Date());

    }



}