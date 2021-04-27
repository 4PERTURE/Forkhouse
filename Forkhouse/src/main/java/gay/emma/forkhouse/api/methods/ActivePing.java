package gay.emma.forkhouse.api.methods;

import gay.emma.forkhouse.api.BaseResponse;
import gay.emma.forkhouse.api.ClubhouseAPIRequest;

public class ActivePing extends ClubhouseAPIRequest<BaseResponse>{
	public ActivePing(String channel){
		super("POST", "active_ping", BaseResponse.class);
		requestBody=new Body(channel);
	}

	private static class Body{
		public String channel;

		public Body(String channel){
			this.channel=channel;
		}
	}
}
