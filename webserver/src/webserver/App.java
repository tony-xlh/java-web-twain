package webserver;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.ResourceHandler;

public class App {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Server server = new Server(9090);
        ResourceHandler resourceHandler = new ResourceHandler();
        resourceHandler.setDirAllowed(true);
        resourceHandler.setResourceBase(".");
        server.setHandler(resourceHandler);
        server.start();
        server.join();
	}

}
