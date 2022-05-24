package com.kbstar.kotlin

// A32Relation.kt
// is a , has a

class Patient(val name: String)
{
    fun doctorList(d:Doctor)
    {
        println("Patient: $name , Doctor: ${d.name}")
    }
}

class PatientOne(val name: String, var id: Int)
{
    fun doctorList(d:DoctorOne)
    {
        println("Patient: $name , Doctor: ${d.name}")
    }
}

// 서로 객체(상대)를 참조하는 양방향 참조
// 각각의 생명주기에 영향을 주지 않을 때, 연관 관계라고 한다.

class Doctor(val name: String)
{
    fun patientList(p: Patient)
    {
        println("Doctor: $name , Patient: ${p.name}")
    }
}

class DoctorOne(val name: String, val p:PatientOne)
{
    val pId :Int = p.id

    fun patientList(p: PatientOne)
    {
        println("Doctor: $name , Patient: ${p.name}, pid : ${pId} ")
    }
}

fun main() {
    val doc = Doctor("Dr. Kim")
    val pat = Patient("HongKilDong")

    doc.patientList(pat)
    pat.doctorList(doc)

    val p1 = PatientOne("LeeSoonShin", 1234)
    val d1 = DoctorOne("Dr. KB", p1)
    p1.doctorList(d1)
    d1.patientList(p1)

}

// 의존관계
// Patient 객체가 먼저 만들어져 있어야 Doctor를 생성할 수 있는 경우