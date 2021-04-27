package gay.emma.forkhouse.api.methods;

import java.lang.reflect.Type;
import java.util.HashMap;

import gay.emma.forkhouse.api.BaseResponse;
import gay.emma.forkhouse.api.ClubhouseAPIRequest;

public class CheckForUpdate extends ClubhouseAPIRequest<BaseResponse>{
	public CheckForUpdate(){
		super("GET", "check_for_update", BaseResponse.class);
		queryParams=new HashMap<>();
		queryParams.put("is_testflight", "0");
	}
}
