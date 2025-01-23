package com.weatherwise.todo.weathe_wise.target.classes;
import com.google.api.services.calendar.Calendar;
import com.google.api.services.calendar.CalendarScopes;
import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.client.http.HttpRequestInitializer;

public class GoogleCalendarService {
    private static final String APPLICATION_NAME = "Weather To-Do";
    private static final JsonFactory JSON_FACTORY = JacksonFactory.getDefaultInstance();
    private static final String API_KEY = "********************************";  // Replace with your API key

    public static Calendar getCalendarService() throws Exception {
        return new Calendar.Builder(
                GoogleNetHttpTransport.newTrustedTransport(),
                JSON_FACTORY,
                (HttpRequestInitializer) request -> {
                    // Set the API key for the request
                    request.getHeaders().setAuthorization("Bearer " + API_KEY);
                })
                .setApplicationName(APPLICATION_NAME)
                .build();
    }
}
