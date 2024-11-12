# Biometric Attendance System

The **Biometric Attendance System** is an offline-based attendance tracking application designed for organizations, specifically tailored to address issues with staff late coming. Built using Java with Swing for the user interface and SQLite as a local database, this application enables easy tracking, logging, and exporting of attendance records, with additional features for role-based access.

## Features

- **Biometric-Based Attendance Logging**: Staff can log their attendance by placing a fingerprint (or ID placeholder) to register their arrival time.
- **Admin Dashboard**: Allows administrators to view attendance records, apply fines for tardiness, and export monthly attendance data.
- **Offline Functionality**: Operates entirely offline, eliminating dependencies on external servers and ensuring consistent operation.
- **Automatic Fines**: Automatically applies fines for late arrivals and absences, configurable by time limits set by the organization.
- **Export to Excel**: Supports data export to Excel format using Apache POI for easy reporting and record-keeping.

## Installation and Setup

### Prerequisites

- **Java Development Kit (JDK)** - Version 8 or higher.
- **IntelliJ IDEA** (recommended) or any other compatible IDE for Java.
- **SQLite** - Pre-installed and configured as a local database.
- **Apache Maven** - For managing project dependencies.

### Clone the Repository

```bash
git clone https://github.com/KabriAcid/Biometric-Attendance-System.git
cd Biometric-Attendance-System
```
Install Dependencies
Ensure all dependencies are set up in your pom.xml file, including:
- sqlite-jdbc: For SQLite database connectivity.
- Apache POI: For Excel export functionality.
Run Maven to install the required dependencies:
```
nvm install
```
### Database Setup
The project stores attendance logs using an SQLite database (attendance.db). Create the database file in the project directory if it doesn’t already exist. Use tools like DB Browser for SQLite to inspect or modify data.

### Running the Application
- Open the project in IntelliJ.
- Run the AttendanceSystemApp class to start the application.
The main screens will guide you through the attendance logging and admin functionalities. Use the "Export" feature on the Admin Dashboard to create an Excel report of attendance records.

### Usage
- Staff Login: Staff can log attendance on the Attendance Logging Screen.
- Admin Login: Admins can access the Admin Dashboard to view and manage attendance records.
- Monthly Export: The Admin can export attendance records to Excel to create monthly reports, with fines automatically included.
### Project Structure
- src/main/java: Contains all source files.
- AttendanceSystemApp.java: Main application file with Swing-based UI screens.
- DatabaseHelper.java: Utility for managing database connections and SQL operations.
- ExportHelper.java: Utility for exporting data to Excel using Apache POI.

### Contributions
Contributions are welcome! If you'd like to contribute:

 - Fork the repository.
 - Create a new branch with a descriptive name.
 - Make your changes and submit a pull request.
### License

--- 
This `README.md` provides detailed information on setting up, using, and extending the Biometric Attendance System. Let me know if you need any additional customization!
---
