# Copilot Guidance: Biometric Attendance System (Electron + Java + SQLite)

We are building a **Fingerprint-based Attendance System** for a Rice Factory.  
The stack and requirements are:

---

## 🔹 Project Setup
- **Frontend/UI**: Electron.js (HTML, CSS, JS, TailwindCSS for styling).
- **Backend (Fingerprint Capture)**: Java SDK from SecuGen (FingerprintService.jar).
- **Database**: SQLite (`attendance.db`) stored locally.
- **Integration**: Electron will call the Java JAR using Node’s `child_process` and get JSON responses.
- **Offline-first**: System runs entirely on one PC (no Internet/server dependency).

---

## 🔹 Database Schema (SQLite)

**employees table**
```sql
CREATE TABLE employees (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    name TEXT NOT NULL,
    department TEXT,
    fingerprint_template BLOB NOT NULL
);

CREATE TABLE attendance_logs (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    employee_id INTEGER NOT NULL,
    timestamp DATETIME DEFAULT CURRENT_TIMESTAMP,
    type TEXT CHECK(type IN ('clock_in', 'clock_out')),
    FOREIGN KEY(employee_id) REFERENCES employees(id)
);
