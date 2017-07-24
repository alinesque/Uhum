package com.microsoft.CognitiveServicesExample;

/**
 * Created by aline on 7/24/2017.
 */

import java.util.Date;

import android.content.Context;

public class CallReceiver extends PhonecallReceiver {

    @Override
    protected void onIncomingCallReceived(Context ctx, String number, Date start)
    {
       System.out.println("onIncomingCallReceived" + ctx.toString() + number + start.toString());
    }

    @Override
    protected void onIncomingCallAnswered(Context ctx, String number, Date start)
    {
        System.out.println("onIncomingCallAnswered" + ctx.toString() + number + start.toString());
    }

    @Override
    protected void onIncomingCallEnded(Context ctx, String number, Date start, Date end)
    {
        System.out.println(ctx.toString() + number + start.toString() + end.toString());
    }

    @Override
    protected void onOutgoingCallStarted(Context ctx, String number, Date start)
    {
        System.out.println(ctx.toString() + number + start.toString());
    }

    @Override
    protected void onOutgoingCallEnded(Context ctx, String number, Date start, Date end)
    {
        System.out.println(ctx.toString() + number + start.toString() + end.toString());
    }

    @Override
    protected void onMissedCall(Context ctx, String number, Date start)
    {
        System.out.println(ctx.toString() + number + start.toString());
    }

}