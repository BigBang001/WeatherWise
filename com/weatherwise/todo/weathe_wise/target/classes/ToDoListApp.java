package com.weatherwise.todo.weathe_wise.target.classes;
import com.weatherwise.todo.JSONObject;
import com.weatherwise.todo.TaskManager;
import com.weatherwise.todo.TaskNotificationService;
import com.weatherwise.todo.WeatherService;

public class ToDoListApp {

    public static void main(String[] args) {
        try {
            // Step 1: Get weather data
            JSONObject weatherData = WeatherService.getWeather("New York");  // Replace with your city
            String weatherDescription = ((Object) weatherData.getJSONArray("weather")).getJSONObject(0).getString("description");
            
            // Step 2: Initialize TaskManager and NotificationService
            TaskManager taskManager = new TaskManager();
            TaskNotificationService notificationService = new TaskNotificationService();

            // Step 3: Check weather and add relevant tasks
            if (weatherDescription.contains("rain")) {
                taskManager.addTask("Bring an umbrella!");
                notificationService.notifyUser("Rain detected: Don't forget your umbrella!");
            }

            if (weatherDescription.contains("sunny")) {
                taskManager.addTask("Go for a walk outside.");
                notificationService.notifyUser("Sunny day: It's perfect for a walk!");
            }

            // Step 4: Display tasks
            System.out.println("\nToday's Tasks:");
            taskManager.displayTasks();
            
            // Optional: Add tasks to Google Calendar
            // GoogleCalendarService.getCalendarService().events().insert(...);  // Example of how to insert events into Google Calendar

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
