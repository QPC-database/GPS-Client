package com.kimbrough.gclientlib;

import android.location.Location;

/**
 * @author Rofaeil Ashaiaa
 *         Created on 20/01/18.
 */

public interface LocationListenerGClient {

    void deliverBroadcastLocationUpdate(Location location, String mLastUpdateTime);

    void onLibraryStateChanged();

    void onMonitoringStateChanged(TicksStateUpdate ticksStateUpdate);

    void deliverInternalTick(Location location, String lastUpdateTime);

    void deliverQuietCircleExpiryParameter(int timerTime, int thresholdTime);

    void deliverQuietCircleRadiusParameters(double distance, double thresholdRadius);

    void onchangeInGoogleStateConnection(GoogleConnectionState state);

    void resetServerTimer();
}
