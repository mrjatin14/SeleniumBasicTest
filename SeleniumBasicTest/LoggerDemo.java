package Log4j2LoggingFramework;

import org.apache.logging.log4j.*;

public class LoggerDemo {
	//Logging- so it means its provide the execution time our system state or information post execution analysis we can check the details
	//Log4j- it is logging framework which is written is java it i open source logging API for java.
	//2 dependies need-1) log4j-core 2) log4j-api
	//	3rd step-> Log4j2.xml file orLog4j2.properties file--->src/main/resource
	//	4th step-> import org.apache.logging.log4j.*;

	public static void main(String[] args) {

		Logger log = LogManager.getLogger();
		System.out.println("this is logger demo");

		log.info("for info only");
		log.fatal("fatal msg");
		log.debug("for debug");
		log.error("error message");
		log.warn("warning message");

	}

}
