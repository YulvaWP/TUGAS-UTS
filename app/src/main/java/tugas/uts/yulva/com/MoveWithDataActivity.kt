package tugas.uts.yulva.com

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_move_with_data.*

class MoveWithDataActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move_with_data)

        val nama = intent.getStringExtra("NAMA")
        val npm = intent.getStringExtra("NPM")
        val kelas = intent.getStringExtra("KELAS")
        val gmail = intent.getStringExtra("GMAIL")
        val foto = intent.getStringExtra("FOTO")


        Glide.with(this).load(foto).override(512, 512).error(R.drawable.yulva).into(ivFotoku)
        tvNamaku.text = nama
        tvNpm.text = npm
        tvKelas.text = kelas
        tvGmail.text = gmail


    }
}
