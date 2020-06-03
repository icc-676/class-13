package com.abs.clase13.utils

import android.annotation.SuppressLint
import android.content.Context
import androidx.lifecycle.LiveData
import android.location.Location
import com.abs.clase13.models.LocationObject
import com.google.android.gms.location.LocationCallback
import com.google.android.gms.location.LocationRequest
import com.google.android.gms.location.LocationResult
import com.google.android.gms.location.LocationServices

class LocationUtil(context: Context) : LiveData<LocationObject>() {


    override fun onInactive() {
        super.onInactive()

    }

    override fun onActive() {
        super.onActive()

    }

    private fun setLocationData(location: Location) {

    }

    private fun startLocationUpdate() {

    }


}