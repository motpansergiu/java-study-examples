package nio.networking.reactorpattern.eventhandler;

import java.nio.channels.SelectionKey;

public interface EventHandler {

    public void handleEvent(SelectionKey handle) throws Exception;
}
