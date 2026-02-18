package ch03

import java.io.BufferedReader
import java.io.File
import java.io.FileReader

class FilePrinter {


    /*
    * 코틀린은 cheked exception과 unchecked exception을 구분하지 x
    * 모두 unchecked Exception!!
    * */
    fun readFile() {
        val currentFile = File(".")
        val file = File(currentFile.absolutePath + "/a.txt")
        val reader = BufferedReader(FileReader(file))
        println(reader.readLine())
        reader.close()
    }

    /*
    * try with resources를 안쓰고 use 사용
    * */
    fun readFileV2(path: String) {
        BufferedReader(FileReader(path)).use { reader ->
            println(reader.readLine())
        }
    }
}