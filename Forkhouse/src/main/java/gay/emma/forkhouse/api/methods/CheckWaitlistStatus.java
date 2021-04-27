package gay.emma.forkhouse.api.methods;

import gay.emma.forkhouse.api.BaseResponse;
import gay.emma.forkhouse.api.ClubhouseAPIRequest;

public class CheckWaitlistStatus extends ClubhouseAPIRequest<CheckWaitlistStatus.Response>{
	public CheckWaitlistStatus(){
		super("POST", "check_waitlist_status", Response.class);
	}

	public static class Response{
		public boolean isWaitlisted, isOnboarding;
	}
}
