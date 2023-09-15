package Log4j2LoggingFramework;

import org.apache.logging.log4j.*;

public class LoggerDemo {

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
