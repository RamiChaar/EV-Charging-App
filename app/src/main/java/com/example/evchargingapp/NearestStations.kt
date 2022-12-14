package com.example.evchargingapp

class NearestStations (var total_results : Int, var fuel_stations: List<Station>) {

}

//api key: atG74JTz1BziqwmY0hecm8a9J14qTnbUb5SOvjPs
//base url: https://developer.nrel.gov/api/alt-fuel-stations/

//get by id:
// v1/{id}.json?api_key={key}

//get nearest stations, adjust radius(miles):
// v1/nearest.json?api_key={key}&latitude={latitude}&longitude={longitude}&radius={radius}&limit=all

//query all stations:
// v1.json?api_key={key}

//https://developer.nrel.gov/api/alt-fuel-stations/v1/nearest.json?api_key=atG74JTz1BziqwmY0hecm8a9J14qTnbUb5SOvjPs&fuel_type=ELEC&latitude=34.2407&longitude=-118.5300&radius=2&limit=all
//https://developer.nrel.gov/docs/transportation/alt-fuel-stations-v1/

//for charging station availability:
//https://api.tomtom.com/search/2/chargingAvailability.{ext}?key={Your_API_Key}&chargingAvailability={chargingAvailabilityId}


