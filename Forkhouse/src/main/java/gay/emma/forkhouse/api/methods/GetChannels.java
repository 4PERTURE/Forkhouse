package gay.emma.forkhouse.api.methods;

import java.util.List;

import gay.emma.forkhouse.api.BaseResponse;
import gay.emma.forkhouse.api.ClubhouseAPIRequest;
import gay.emma.forkhouse.api.model.Channel;

public class GetChannels extends ClubhouseAPIRequest<GetChannels.Response>{
	public GetChannels(){
		super("GET", "get_channels", Response.class);
	}

	public static class Response{
		public List<Channel> channels;
	}
}
