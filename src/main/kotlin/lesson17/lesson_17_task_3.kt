package lesson17

import lesson10.selectTheResult

class Folder() {
    var quantityFiles: Int = 0
    var accessFlag: Boolean = false
    var nameFolder: String = ""
        get() {
            if (accessFlag == true) {
                quantityFiles = 0
                println("Cкрытая папка $field.\nКол-во файлов $quantityFiles")
            } else {
                println("Папка $field.\nКол-во файлов $quantityFiles")
            }
            return field
        }
}

fun main() {
    val folderSecret = Folder()
    folderSecret.nameFolder = "Секрет"
    folderSecret.quantityFiles = 23
    folderSecret.accessFlag = true
    val folderNotSecret = Folder()
    folderNotSecret.nameFolder = "Не секрет"
    folderNotSecret.quantityFiles = 5

    println(folderSecret.nameFolder)
    println()
    println(folderNotSecret.nameFolder)
}