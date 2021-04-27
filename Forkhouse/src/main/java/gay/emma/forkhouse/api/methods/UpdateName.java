package gay.emma.forkhouse.api.methods;

import java.lang.reflect.Type;

import gay.emma.forkhouse.api.BaseResponse;
import gay.emma.forkhouse.api.ClubhouseAPIRequest;

public class UpdateName extends ClubhouseAPIRequest<BaseResponse>{
	public UpdateName(String name){
		super("POST", "update_name", BaseResponse.class);
		requestBody=new Body(name);
	}

	private static class Body{
		public String name;

		public Body(String name){
			this.name=name;
		}
	}
}
