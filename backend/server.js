const express = require("express");
const Database = require("better-sqlite3");
const app = express();

const db = new Database("../attendance.db");

app.use(express.json());

// Example endpoint
app.get("/api/employees", (req, res) => {
  db.all("SELECT * FROM employees", [], (err, rows) => {
    if (err) return res.status(500).json({ error: err.message });
    res.json(rows);
  });
});

// Add more endpoints here...

app.listen(3000, () => {
  console.log("Server running on http://localhost:3000");
});
