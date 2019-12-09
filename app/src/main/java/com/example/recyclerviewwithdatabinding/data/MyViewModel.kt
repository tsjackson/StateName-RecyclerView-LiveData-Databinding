package com.example.recyclerviewwithdatabinding.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyViewModel : ViewModel() {
    private val _nameString = MutableLiveData<List<String>>()
    val nameString: LiveData<List<String>> = _nameString

    init {
        val data = listOf(
            "Alabama - AL",
            "Alaska - AK",
            "Arizona - AZ",
            "Arkansas - AR",
            "California - CA",
            "Colorado - CO",
            "Connecticut - CT",
            "Delaware - DE",
            "Florida - FL",
            "Georgia - GA",
            "Hawaii - HI",
            "Idaho - ID",
            "Illinois - IL",
            "Indiana - IN",
            "Iowa - IA",
            "Kansas - KS",
            "Kentucky - KY",
            "Louisiana - LA",
            "Maine - ME",
            "Maryland - MD",
            "Massachusetts - MA",
            "Michigan - MI",
            "Minnesota - MN",
            "Mississippi - MS",
            "Missouri - MO",
            "Montana - MT",
            "Nebraska - NE",
            "Nevada - NV",
            "New Hampshire - NH",
            "New Jersey - NJ",
            "New Mexico - NM",
            "New York - NY",
            "North Carolina - NC",
            "North Dakota - ND",
            "Ohio - OH",
            "Oklahoma - OK",
            "Oregon - OR",
            "Pennsylvania - PA",
            "Rhode Island - RI",
            "South Carolina - SC",
            "South Dakota - SD",
            "Tennessee - TN",
            "Texas - TX",
            "Utah - UT",
            "Vermont - VT",
            "Virginia - VA",
            "Washington - WA",
            "West Virginia - WV",
            "Wisconsin - WI",
            "Wyoming - WY"
        )
        _nameString.value = data
    }
}