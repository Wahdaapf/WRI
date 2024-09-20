class Employee {
    private String name;
    private String position;

    // Hanya bertanggung jawab atas data Employee
}

class EmployeeDatabase {
    public void saveEmployeeToDatabase(Employee employee) {
        // logika menyimpan ke database
    }
}

class PayReport {
    public void printPayReport(Employee employee) {
        // logika mencetak laporan gaji
    }
}
