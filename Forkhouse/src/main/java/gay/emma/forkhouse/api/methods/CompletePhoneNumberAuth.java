package gay.emma.forkhouse.api.methods;

import java.lang.reflect.Type;

import gay.emma.forkhouse.api.ClubhouseAPIRequest;
import gay.emma.forkhouse.api.model.User;

public class CompletePhoneNumberAuth extends ClubhouseAPIRequest<CompletePhoneNumberAuth.Response>{

	public CompletePhoneNumberAuth(String phoneNumber, String code){
		super("POST", "complete_phone_number_auth", Response.class);
		requestBody=new Body(phoneNumber, code);
	}

	public static class Response{
		public String authToken, accessToken, refreshToken;
		public boolean isWaitlisted;
		public User userProfile;
	}

	private static class Body{
		public String phoneNumber, verificationCode;

		public Body(String phoneNumber, String verificationCode){
			this.phoneNumber=phoneNumber;
			this.verificationCode=verificationCode;
		}
	}
}
