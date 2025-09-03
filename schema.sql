-- Biometric Attendance System Schema

CREATE TABLE employees (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    name TEXT NOT NULL,
    department TEXT,
    fingerprint_template BLOB NOT NULL,
    created_at DATETIME DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE attendance_logs (
    log_id INTEGER PRIMARY KEY AUTOINCREMENT,
    employee_id INTEGER NOT NULL,
    timestamp DATETIME DEFAULT CURRENT_TIMESTAMP,
    status TEXT CHECK(status IN ('IN', 'OUT')) NOT NULL,
    FOREIGN KEY (employee_id) REFERENCES employees(id)
);
