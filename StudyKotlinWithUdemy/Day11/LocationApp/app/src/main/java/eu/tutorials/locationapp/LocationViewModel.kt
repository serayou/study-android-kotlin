package eu.tutorials.locationapp

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class LocationViewModel: ViewModel() {
    private val _location = mutableStateOf<LocationData?>(null)
    val location: State<LocationData?> = _location //외부에서 접근할 수 있는 데이터

    fun updateLocation(newLocation: LocationData){
        _location.value = newLocation
    }

}