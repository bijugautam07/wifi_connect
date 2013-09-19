package com.example.test;

import android.app.Notification;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.service.notification.NotificationListenerService;
import android.service.notification.StatusBarNotification;
import android.widget.RemoteViews;

public class NotificationListr extends NotificationListenerService {

	public void onCreate(){
		
	}
	
	
	@Override
	public void onNotificationPosted(StatusBarNotification sbn) {
		// TODO Auto-generated method stub
		
		/*Notification notification_msg = sbn.getNotification();
		
		RemoteViews expanded_view = notification_msg.contentView;
		
		expanded_view.*/
		
		//StatusBarNotification[] active_notification = this.getActiveNotifications();
		/*
		active_notification[0].*/
		System.out.println("notification done!!!");
		Intent i = new  Intent("com.example.test.NOTIFICATION_LISTENER_EXAMPLE");
		i.putExtra("notification_event","onNotificationPosted :" + sbn.toString() + ":n");
		sendBroadcast(i);
		
		
		
	}

	@Override
	public void onNotificationRemoved(StatusBarNotification sbn) {
		// TODO Auto-generated method stub
		
	}
	
	class NotifyBroadcast extends BroadcastReceiver{

		@Override
		public void onReceive(Context context, Intent intent) {
			// TODO Auto-generated method stub
			
		}
		
	}

}
