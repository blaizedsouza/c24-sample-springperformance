package biz.c24.retaildemo.perftest;

import java.util.HashMap;
import java.util.Map;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameter;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class BatchTest {

    public static void main(String[] args) throws JobExecutionAlreadyRunningException, JobRestartException, JobInstanceAlreadyCompleteException, JobParametersInvalidException, InterruptedException  {
        
        // Create our application context - assumes the Spring configuration is in the classpath in a file called spring-config.xml
        ApplicationContext context = new ClassPathXmlApplicationContext("receipts/receipt-batch-config.xml");
	
        // Get the job
        Job job = context.getBean("fileLoader", Job.class);
        
        // .. and a single JobLauncher bean
        JobLauncher jobLauncher = context.getBean(JobLauncher.class);
        
        // Create the job parameters and supply the name of the file to parse
        Map<String, JobParameter> params = new HashMap<String, JobParameter>();
        
        // The C24ItemReader is configured to get the filename from a job parameter called input.file
        params.put("input.file", new JobParameter("data/xml/dailyLarge/txns-4.xml"));
        
        JobParameters jobParameters = new JobParameters(params);

        // Launch the job!
        jobLauncher.run(job, jobParameters);
        
        System.exit(0);
    }
}
