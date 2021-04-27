package gay.emma.forkhouse.api.methods;

import java.lang.reflect.Type;

import gay.emma.forkhouse.api.ClubhouseAPIRequest;
import gay.emma.forkhouse.api.model.Channel;

public class JoinChannel extends ClubhouseAPIRequest<Channel>{

	public JoinChannel(String channelName){
		super("POST", "join_channel", Channel.class);
		requestBody=new Body(channelName, "feed", "eyJpc19leHBsb3JlIjpmYWxzZSwicmFuayI6MX0=");
	}

	private static class Body{
		public String channel, attributionSource, attributionDetails;

		public Body(String channel, String attributionSource, String attributionDetails){
			this.channel=channel;
			this.attributionSource=attributionSource;
			this.attributionDetails=attributionDetails;
		}
	}
}
