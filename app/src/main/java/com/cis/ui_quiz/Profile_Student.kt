package com.cis.ui_quiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_profile__student.*

class Profile_Student : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile__student)
        val id = intent.getStringExtra("id")
        Toast.makeText(this,id.toString(), Toast.LENGTH_SHORT).show()
        if (id == "0") {
            val textname: TextView = findViewById(R.id.textView6)
            textname.text = "นายกฤษฎา ท่าสะอาด"
            val textid: TextView = findViewById(R.id.textView7)
            textid.text = "603410032-9"
            val iconimg: ImageView = findViewById(R.id.profile_image)
            iconimg.setImageResource(R.drawable.m)

        }
        if (id == "1") {
            val textname: TextView = findViewById(R.id.textView6)
            textname.text = "นายกัมพล โชติทอง"
            val textid: TextView = findViewById(R.id.textView7)
            textid.text = "603410034-5"
            val iconimg: ImageView = findViewById(R.id.profile_image)
            iconimg.setImageResource(R.drawable.m)
        }
        if (id == "2") {
            val textname: TextView = findViewById(R.id.textView6)
            textname.text = "นายณัฐนนท์ ทาไธสง"
            val textid: TextView = findViewById(R.id.textView7)
            textid.text = "603410041-8"
            val iconimg: ImageView = findViewById(R.id.profile_image)
            iconimg.setImageResource(R.drawable.m)
        }
        if (id == "3") {
            val textname: TextView = findViewById(R.id.textView6)
            textname.text = "นายนฤเบศร์ พระโรจน์"
            val textid: TextView = findViewById(R.id.textView7)
            textid.text = "603410204-6"
            val iconimg: ImageView = findViewById(R.id.profile_image)
            iconimg.setImageResource(R.drawable.m)

        }
        if (id == "4") {
            val textname: TextView = findViewById(R.id.textView6)
            textname.text = "นายพรหมพัฒน์ ชาญโชคประเสริฐ"
            val textid: TextView = findViewById(R.id.textView7)
            textid.text = "603410052-3"
            val iconimg: ImageView = findViewById(R.id.profile_image)
            iconimg.setImageResource(R.drawable.m)
        }
        if (id == "5") {
            val textname: TextView = findViewById(R.id.textView6)
            textname.text = "นายเมธาวี สารีผล"
            val textid: TextView = findViewById(R.id.textView7)
            textid.text = "603410057-3"
            val iconimg: ImageView = findViewById(R.id.profile_image)
            iconimg.setImageResource(R.drawable.m)
        }
        if (id == "6") {
            val textname: TextView = findViewById(R.id.textView6)
            textname.text = "นายรัฐเขต สีเหลือง"
            val textid: TextView = findViewById(R.id.textView7)
            textid.text = "603410059-9"
            val iconimg: ImageView = findViewById(R.id.profile_image)
            iconimg.setImageResource(R.drawable.m)
        }
        if (id == "7") {
            val textname: TextView = findViewById(R.id.textView6)
            textname.text = "นายรุ่งโรจน์ พลเยี่ยม"
            val textid: TextView = findViewById(R.id.textView7)
            textid.text = "603410060-4"
            val iconimg: ImageView = findViewById(R.id.profile_image)
            iconimg.setImageResource(R.drawable.m)
        }
        if (id == "8") {
            val textname: TextView = findViewById(R.id.textView6)
            textname.text = "นายวิธาน วงษาบุตร"
            val textid: TextView = findViewById(R.id.textView7)
            textid.text = "603410061-2"
            val iconimg: ImageView = findViewById(R.id.profile_image)
            iconimg.setImageResource(R.drawable.m)
        }
        if (id == "9") {
            val textname: TextView = findViewById(R.id.textView6)
            textname.text = "นางสาวศศิกร กอเสนาะรส"
            val textid: TextView = findViewById(R.id.textView7)
            textid.text = "603410063-8"
            val iconimg: ImageView = findViewById(R.id.profile_image)
            iconimg.setImageResource(R.drawable.w)
        }
        if (id == "10") {
            val textname: TextView = findViewById(R.id.textView6)
            textname.text = "นางสาวอนันตยา โคตรศรี "
            val textid: TextView = findViewById(R.id.textView7)
            textid.text = "603410070-1"
            val iconimg: ImageView = findViewById(R.id.profile_image)
            iconimg.setImageResource(R.drawable.w)
        }
        if (id == "11") {
            val textname: TextView = findViewById(R.id.textView6)
            textname.text = "นายอภิเดช นารอง"
            val textid: TextView = findViewById(R.id.textView7)
            textid.text = "603410071-9"
            val iconimg: ImageView = findViewById(R.id.profile_image)
            iconimg.setImageResource(R.drawable.m)
        }
        if (id == "12") {
            val textname: TextView = findViewById(R.id.textView6)
            textname.text = "นายอุทัยพันธ์ เที่ยงโคตร"
            val textid: TextView = findViewById(R.id.textView7)
            textid.text = "603410073-5"
            val iconimg: ImageView = findViewById(R.id.profile_image)
            iconimg.setImageResource(R.drawable.m)
        }
        if (id == "13") {
            val textname: TextView = findViewById(R.id.textView6)
            textname.text = "นางสาวพัชรี แอแป "
            val textid: TextView = findViewById(R.id.textView7)
            textid.text = "603410155-3"
            val iconimg: ImageView = findViewById(R.id.profile_image)
            iconimg.setImageResource(R.drawable.w)
        }
        if (id == "14") {
            val textname: TextView = findViewById(R.id.textView6)
            textname.text = "นางสาวศศิธร พิมมะทา"
            val textid: TextView = findViewById(R.id.textView7)
            textid.text = " 603410156-1"
            val iconimg: ImageView = findViewById(R.id.profile_image)
            iconimg.setImageResource(R.drawable.w)
        }
        if (id == "15") {
            val textname: TextView = findViewById(R.id.textView6)
            textname.text = "นายสุรพร อินพิลึก"
            val textid: TextView = findViewById(R.id.textView7)
            textid.text = "603410157-9"
            val iconimg: ImageView = findViewById(R.id.profile_image)
            iconimg.setImageResource(R.drawable.m)
        }
        if (id == "16") {
            val textname: TextView = findViewById(R.id.textView6)
            textname.text = "นายกฤษดา อุ่นสำโรง "
            val textid: TextView = findViewById(R.id.textView7)
            textid.text = "603410194-3"
            val iconimg: ImageView = findViewById(R.id.profile_image)
            iconimg.setImageResource(R.drawable.m)
        }
        if (id == "17") {
            val textname: TextView = findViewById(R.id.textView6)
            textname.text = "นายณรงค์ศึก เตชะศรี"
            val textid: TextView = findViewById(R.id.textView7)
            textid.text = "603410200-4"
            val iconimg: ImageView = findViewById(R.id.profile_image)
            iconimg.setImageResource(R.drawable.m)
        }
        if (id == "18") {
            val textname: TextView = findViewById(R.id.textView6)
            textname.text = "นายติยพล ต่อติด"
            val textid: TextView = findViewById(R.id.textView7)
            textid.text = "603410202-0"
            val iconimg: ImageView = findViewById(R.id.profile_image)
            iconimg.setImageResource(R.drawable.m)

        }
        if (id == "19") {
            val textname: TextView = findViewById(R.id.textView6)
            textname.text = "นายทรัพย์ทวี เพ็ชรสาย"
            val textid: TextView = findViewById(R.id.textView7)
            textid.text = "603410203-8"
            val iconimg: ImageView = findViewById(R.id.profile_image)
            iconimg.setImageResource(R.drawable.m)
        }
        if (id == "20") {
            val textname: TextView = findViewById(R.id.textView6)
            textname.text = "นางสาวธิดารัตน์ ดานะพันธ์"
            val textid: TextView = findViewById(R.id.textView7)
            textid.text = "603410204-6"
            val iconimg: ImageView = findViewById(R.id.profile_image)
            iconimg.setImageResource(R.drawable.w)
        }
        if (id == "21") {
            val textname: TextView = findViewById(R.id.textView6)
            textname.text = "นายปิยทัศน์ นวกิจวัฒนา"
            val textid: TextView = findViewById(R.id.textView7)
            textid.text = " 603410203-8"
            val iconimg: ImageView = findViewById(R.id.profile_image)
            iconimg.setImageResource(R.drawable.m)
        }
        if (id == "22") {
            val textname: TextView = findViewById(R.id.textView6)
            textname.text = "นายพรสิน มีสีบู"
            val textid: TextView = findViewById(R.id.textView7)
            textid.text = "603410210-1"
            val iconimg: ImageView = findViewById(R.id.profile_image)
            iconimg.setImageResource(R.drawable.m)
        }
        if (id == "23") {
            val textname: TextView = findViewById(R.id.textView6)
            textname.text = "นายพัชรพล ไทยมานี้"
            val textid: TextView = findViewById(R.id.textView7)
            textid.text = "603410211-9"
            val iconimg: ImageView = findViewById(R.id.profile_image)
            iconimg.setImageResource(R.drawable.m)
        }
        if (id == "24") {
            val textname: TextView = findViewById(R.id.textView6)
            textname.text = "นายวงษกร พันธ์พิบูลย์"
            val textid: TextView = findViewById(R.id.textView7)
            textid.text = "603410213-5"
            val iconimg: ImageView = findViewById(R.id.profile_image)
            iconimg.setImageResource(R.drawable.m)
        }
        if (id == "25") {
            val textname: TextView = findViewById(R.id.textView6)
            textname.text = "นายวรรณพงษ์ ภัททิยไพบูลย์"
            val textid: TextView = findViewById(R.id.textView7)
            textid.text = "603410214-3"
            val iconimg: ImageView = findViewById(R.id.profile_image)
            iconimg.setImageResource(R.drawable.m)
        }
        if (id == "26") {
            val textname: TextView = findViewById(R.id.textView6)
            textname.text = "นายวิวัฒน์ วงษ์พิชัย"
            val textid: TextView = findViewById(R.id.textView7)
            textid.text = "603410217-7"
            val iconimg: ImageView = findViewById(R.id.profile_image)
            iconimg.setImageResource(R.drawable.m)
        }
        if (id == "27") {
            val textname: TextView = findViewById(R.id.textView6)
            textname.text = "นางสาวศุภรัตน์ นพวัติ "
            val textid: TextView = findViewById(R.id.textView7)
            textid.text = "603410219-3"
            val iconimg: ImageView = findViewById(R.id.profile_image)
            iconimg.setImageResource(R.drawable.w)
        }
        if (id == "28") {
            val textname: TextView = findViewById(R.id.textView6)
            textname.text = "นางสาวสิรินาถ จริยพันธ์"
            val textid: TextView = findViewById(R.id.textView7)
            textid.text = "603410221-6"
            val iconimg: ImageView = findViewById(R.id.profile_image)
            iconimg.setImageResource(R.drawable.w)
        }
        if (id == "29") {
            val textname: TextView = findViewById(R.id.textView6)
            textname.text = "นายเกียรติศักดิ์ วรภาพ"
            val textid: TextView = findViewById(R.id.textView7)
            textid.text = "603410289-2"
            val iconimg: ImageView = findViewById(R.id.profile_image)
            iconimg.setImageResource(R.drawable.m)
        }
        if (id == "30") {
            val textname: TextView = findViewById(R.id.textView6)
            textname.text = "นางสาวธัญสิริ ผลไสว"
            val textid: TextView = findViewById(R.id.textView7)
            textid.text = "603410291-5"
            val iconimg: ImageView = findViewById(R.id.profile_image)
            iconimg.setImageResource(R.drawable.w)
        }
        if (id == "31") {
            val textname: TextView = findViewById(R.id.textView6)
            textname.text = "นางสาวอาทิตยา ฉิมมาแก้ว"
            val textid: TextView = findViewById(R.id.textView7)
            textid.text = "603410321-2"
            val iconimg: ImageView = findViewById(R.id.profile_image)
            iconimg.setImageResource(R.drawable.w)
        }

        button.setOnClickListener(){
            val i = Intent(this,List_Student::class.java)
            startActivity(i)
        }


    }
}
