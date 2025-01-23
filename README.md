# **WeatherWise: Weather-Powered Smart To-Do List**

**WeatherWise** is a Java-based application that integrates weather data and Google Calendar to provide a personalized, dynamic to-do list. This application helps users organize their day by generating weather-dependent tasks and syncing them with Google Calendar.

---

## **Features**

- Fetches real-time weather data for a specified city using the **OpenWeatherMap API**.
- Automatically generates weather-specific to-do tasks (e.g., "Bring an umbrella" on rainy days).
- Notifies users of tasks via a simple notification system.
- Integrates with **Google Calendar** to schedule tasks and events.
- Easy-to-extend modular architecture for additional features.

---

## **Technologies Used**

- **Java**: Core programming language.
- **Google Calendar API**: For task synchronization with Google Calendar.
- **OpenWeatherMap API**: For real-time weather data.
- **JSON**: For parsing weather API responses.

---

## **Setup Instructions**

### **1. Prerequisites**
- **Java Development Kit (JDK)**: Version 8 or higher.
- **Maven**: For dependency management.
- **API Keys**:
  - [Get an API Key from OpenWeatherMap](https://home.openweathermap.org/api_keys)
  - [Get an API Key for Google Calendar](https://console.cloud.google.com/apis/)

### **2. Clone the Repository**
```bash
git clone https://github.com/yourusername/weather-powered-todo.git
cd weather-powered-todo
```

### **3. Add API Keys**
Replace the placeholder API keys in the `Config.java` file with your actual keys:
```java
public static final String WEATHER_API_KEY = "YOUR_OPENWEATHERMAP_API_KEY";  
public static final String GOOGLE_API_KEY = "YOUR_GOOGLE_API_KEY";
```

### **4. Install Dependencies**
If you’re using Maven, add the following dependencies to your `pom.xml` file:

```xml
<dependencies>
    <!-- Google API Client -->
    <dependency>
        <groupId>com.google.api-client</groupId>
        <artifactId>google-api-client</artifactId>
        <version>1.34.1</version>
    </dependency>

    <!-- Google Calendar API -->
    <dependency>
        <groupId>com.google.apis</groupId>
        <artifactId>google-api-services-calendar</artifactId>
        <version>v3-rev305-1.25.0</version>
    </dependency>

    <!-- JSON Parsing -->
    <dependency>
        <groupId>org.json</groupId>
        <artifactId>json</artifactId>
        <version>20230227</version>
    </dependency>
</dependencies>
```

Run Maven to download dependencies:
```bash
mvn clean install
```

### **6. Run the Application**
Use your IDE or command line to run the `ToDoListApp.java` file.

```bash
mvn exec:java -Dexec.mainClass="com.weatherwise.todo.ToDoListApp"
```

---

## **How It Works**

1. **Weather Data Fetching**: The application uses the OpenWeatherMap API to fetch weather details for the given city.
2. **Task Generation**: Based on the weather conditions, specific tasks are added to the to-do list (e.g., "Carry sunscreen on a sunny day").
3. **Notifications**: A basic notification system alerts users about these tasks.
4. **Google Calendar Integration**: Tasks can be synced with Google Calendar using the Google Calendar API.

---

## **Troubleshooting**

### **Common Issues**
1. **Invalid API Key**: Ensure your OpenWeatherMap and Google API keys are correct and active.
2. **Dependencies Not Found**: Verify that Maven has successfully downloaded all dependencies.
3. **Calendar API Permissions**: Ensure that your Google API project is configured with the correct OAuth scope (`CalendarScopes.CALENDAR`).

---

## **Contributing**

Contributions are welcome! Feel free to fork the repository and submit a pull request.

---

## **Acknowledgments**

- [OpenWeatherMap API](https://openweathermap.org/)
- [Google Calendar API](https://developers.google.com/calendar)

---
