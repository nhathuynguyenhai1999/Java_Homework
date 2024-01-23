package com.StudentsJames

class Students {
    private var name: String = "John"
    private var classes: String = "C02"

    constructor() // Hàm tạo không có tham số

    // Phương thức có access modifier là public
    fun setName(name: String) {
        this.name = name
    }

    // Phương thức có access modifier là public
    fun setClasses(classes: String) {
        this.classes = classes
    }
}

class Test {
    fun testStudent() {
        // Tạo đối tượng Student
        val student = Students()

        // Truy cập phương thức setName và setClasses
        student.setName("Alice")
        student.setClasses("C01")
    }
}

fun main() {
    // Tạo đối tượng Test và gọi hàm testStudent
    val test = Test()
    test.testStudent()
}
