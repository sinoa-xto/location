package com.feature.toggle.feature_toggle;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class LocationController {

    @PostMapping("/location")
    public ResponseEntity<String> receiveLocation(@RequestBody Map<String, Object> payload) {
        try {
            double lat = Double.parseDouble(payload.get("latitude").toString());
            double lon = Double.parseDouble(payload.get("longitude").toString());

            String mapsUrl = "https://www.google.com/maps?q=" + lat + "," + lon;

            System.out.println("User location received:");
            System.out.println("Latitude: " + lat);
            System.out.println("Longitude: " + lon);
            System.out.println("Google Maps URL: " + mapsUrl);

            // Optional: Save mapsUrl to DB or log file

            return ResponseEntity.ok("Location received: " + mapsUrl);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Invalid location data");
        }
    }
}
