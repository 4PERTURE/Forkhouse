package gay.emma.forkhouse.api.methods;

import gay.emma.forkhouse.api.BaseResponse;
import gay.emma.forkhouse.api.ClubhouseAPIRequest;

public class AudienceReply extends ClubhouseAPIRequest<BaseResponse>{
	public AudienceReply(String channel, boolean raise){
		super("POST", "audience_reply", BaseResponse.class);
		requestBody=new Body(channel, raise, !raise);
	}

	private static class Body{
		public String channel;
		public boolean raiseHands, unraiseHands;

		public Body(String channel, boolean raiseHands, boolean unraiseHands){
			this.channel=channel;
			this.raiseHands=raiseHands;
			this.unraiseHands=unraiseHands;
		}
	}
}
