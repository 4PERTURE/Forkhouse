package gay.emma.forkhouse.fragments;

import android.app.Activity;

import me.grishka.appkit.api.SimpleCallback;
import gay.emma.forkhouse.R;
import gay.emma.forkhouse.api.BaseResponse;
import gay.emma.forkhouse.api.methods.GetFollowers;

public class FollowersFragment extends UserListFragment{

	@Override
	public void onAttach(Activity activity){
		super.onAttach(activity);
		setTitle(R.string.followers_title);
	}

	@Override
	protected void doLoadData(int offset, int count){
		currentRequest=new GetFollowers(getArguments().getInt("id"), 50, offset/50+1)
				.setCallback(new SimpleCallback<GetFollowers.Response>(this){
					@Override
					public void onSuccess(GetFollowers.Response result){
						currentRequest=null;
						onDataLoaded(result.users, data.size()+preloadedData.size()+result.users.size()<result.count);
					}
				})
				.exec();
	}
}
