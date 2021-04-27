package gay.emma.forkhouse.notification;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import java.util.Objects;

import gay.emma.forkhouse.VoiceService;

public class NotificationHandlerBroadcastReceiver extends BroadcastReceiver {
    public static final String ACTION_LEAVE_ROOM = "ACTION_LEAVE_ROOM";

    @Override
    public void onReceive(Context context, Intent intent) {
        if (Objects.equals(intent.getAction(), ACTION_LEAVE_ROOM)) {
            if (VoiceService.getInstance() != null) {
                VoiceService.getInstance().leaveCurrentChannel();
            }
        }
    }
}
