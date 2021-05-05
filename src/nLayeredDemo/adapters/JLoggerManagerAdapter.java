package nLayeredDemo.adapters;

import nLayeredDemo.core.LoggerService;
import nLayeredDemo.jLogger.JLoggerManager;

public class JLoggerManagerAdapter implements LoggerService{

	@Override
	public void logTosystem(String message) {
		JLoggerManager jLoggerManager=new JLoggerManager();
		jLoggerManager.log(message);
		
	}

	
}
