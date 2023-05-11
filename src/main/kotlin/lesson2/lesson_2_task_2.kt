package lesson2
// ... работа не волк, в лес не убежит ...
fun main() {
    val oldWorkers = 50
    val salaryOldWorkers = 30000
    val newInterns = 30
    val salaryNewInterns = 20000

    val sumSalaryOldWorkers = oldWorkers*salaryOldWorkers
    val sumSalaryAll = (oldWorkers*salaryOldWorkers)+(newInterns*salaryNewInterns)
    val averangeSalary: Int = sumSalaryAll/(oldWorkers+newInterns)

    println("Расходы на выплату заплаты постоянных сотрудников составляет:\n" +
            "$sumSalaryOldWorkers рублей")
    println("Общие расходы по зарплате после устройства стажеров составляет:\n" +
            "$sumSalaryAll рублей")
    println("Средняя зарплата сотрудника после устройства стажеров составила:\n" +
            "$averangeSalary рублей")
}