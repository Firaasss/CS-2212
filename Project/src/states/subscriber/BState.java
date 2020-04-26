package states.subscriber;

import events.AbstractEvent;

public class BState implements IState {

	public void handleEvent(AbstractEvent event, String channelName) {
		
		System.out.println("Event "+ event.hashCode() + " in channel " + channelName + " is handled by Bstate");
	}

}
