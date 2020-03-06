package com.cis.ui_quiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import com.cis.ui_quiz.Adepter.StudentAdapter
import com.cis.ui_quiz.Model.Student

class List_Student : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list__student)

        var student: Student = Student("นายกฤษฎา ท่าสะอาด","603410032-9",R.drawable.m)

        var students= mutableListOf<Student>()
        students.add(student)
        students.add(Student("นายกัมพล โชติทอง","603410034-5",R.drawable.m))
        students.add(Student("นายณัฐนนท์ ทาไธสง","603410041-8",R.drawable.m))
        students.add(Student("นายนฤเบศร์ พระโรจน์","603410047-6",R.drawable.m))
        students.add(Student("นายพรหมพัฒน์ ชาญโชคประเสริฐ","603410052-3",R.drawable.m))
        students.add(Student("นายเมธาวี สารีผล","603410057-3",R.drawable.m))
        students.add(Student("นายรัฐเขต สีเหลือง","603410059-9",R.drawable.m))
        students.add(Student("นายรุ่งโรจน์ พลเยี่ยม","603410060-4",R.drawable.m))
        students.add(Student("นายวิธาน วงษาบุตร","603410061-2",R.drawable.m))
        students.add(Student("นางสาวศศิกร กอเสนาะรส","603410063-8",R.drawable.w))
        students.add(Student("นางสาวอนันตยา โคตรศรี","603410070-1",R.drawable.w))
        students.add(Student("นายอภิเดช นารอง","603410071-9",R.drawable.m))
        students.add(Student("นายอุทัยพันธ์ เที่ยงโคตร","603410073-5",R.drawable.m))
        students.add(Student("นางสาวพัชรี แอแป","603410155-3",R.drawable.w))
        students.add(Student("นางสาวศศิธร พิมมะทา","603410156-1",R.drawable.w))
        students.add(Student("นายสุรพร อินพิลึก","603410157-9",R.drawable.m))
        students.add(Student("นายกฤษดา อุ่นสำโรง","603410194-3",R.drawable.m))
        students.add(Student("นายณรงค์ศึก เตชะศรี","603410200-4",R.drawable.m))
        students.add(Student("นายติยพล ต่อติด","603410202-0",R.drawable.m))
        students.add(Student("นายทรัพย์ทวี เพ็ชรสาย","603410203-8",R.drawable.m))
        students.add(Student("นางสาวธิดารัตน์ ดานะพันธ์","603410204-6",R.drawable.w))
        students.add(Student("นายปิยทัศน์ นวกิจวัฒนา","603410208-8",R.drawable.m))
        students.add(Student("นายพรสิน มีสีบู","603410210-1",R.drawable.m))
        students.add(Student("นายพัชรพล ไทยมานี้","603410211-9",R.drawable.m))
        students.add(Student("นายวงษกร พันธ์พิบูลย์","603410213-5",R.drawable.m))
        students.add(Student("นายวรรณพงษ์ ภัททิยไพบูลย์","603410214-3",R.drawable.m))
        students.add(Student("นายวิวัฒน์ วงษ์พิชัย","603410217-7",R.drawable.m))
        students.add(Student("นางสาวศุภรัตน์ นพวัติ","603410219-3",R.drawable.w))
        students.add(Student("นางสาวสิรินาถ จริยพันธ์","603410221-6",R.drawable.w))
        students.add(Student("นายเกียรติศักดิ์ วรภาพ","603410289-2",R.drawable.m))
        students.add(Student("นางสาวธัญสิริ ผลไสว","603410291-5",R.drawable.w))
        students.add(Student("นายเกียรติศักดิ์ วรภาพ","603410321-2",R.drawable.m))
        students.add(Student("นางสาวอาทิตยา ฉิมมาแก้ว","603410219-3",R.drawable.w))


        var listview: ListView = findViewById(R.id.ListView)
        listview.adapter= StudentAdapter(this,R.layout.listitem_student,students)

        listview.setOnItemClickListener { parent, view, position, id ->
            //            Toast.makeText(this,position.toString(),Toast.LENGTH_LONG).show()
            val i = Intent(this,Profile_Student::class.java)
            i.putExtra("id",position.toString())
            startActivity(i)
        }
    }
}
